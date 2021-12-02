#! /bin/bash
source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini
table=t_users
script_path=$azkaban_home/hdfs

if [ -n "$1" ]; then
  # 传入的日期
  do_date=$1
else
  # 昨天的日期
  do_date=$(date -d '-1 day' +%F)
fi

# 源数据目录
target_path=/origin_data/x6_mc/db/$table/$do_date


## t_users新增及变化
query_sql="SELECT
	id,
	NAME,
	phone,
  last_login_ip,
	last_login_time,
	time,
	repo_id,
	picker_name,
	picker_phone,
	picker_addr,
	address_id,
	employee_id,
	up_uid,
	real_up_uid,
	up_uid_time,
	ykt_id,
	ykt_account_id,
	user_device_id,
	channel,
	personal_balance,
	company_balance,
	quota_balance,
	company_id,
	employee_type,
	create_from,
  update_time
FROM
	t_users
	where (date_format(time,'%Y-%m-%d')='$do_date' or date_format(update_time,'%Y-%m-%d')='$do_date')"


echo "导入 $table start"
sh $script_path/basic_sqoop.sh "$target_path" "$query_sql"
echo "导入 $table end"
