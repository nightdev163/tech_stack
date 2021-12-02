#! /bin/bash
source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini
table=t_order
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

# t_stat_order 与 t_order 为1对1的关系，新增及变化
query_sql="select
       o.id,
       o.uid,
       o.repo_id,
       o.picker_name,
       o.picker_phone,
       o.picker_addr,
       o.picker_detail_addr,
       o.picker_longitude,
       o.picker_latitude,
       o.cp_order_id,
       o.unify_order_id,
       o.pay_type,
       o.mode,
       o.original_price,
       o.total_offer,
       o.payable_money,
       o.real_money,
       o.delivery_fee,
       o.status1,
       o.evaluate_status,
       o.time,
       o.pay_time,
       o.estimated_arrival_time,
       o.expected_receive_time,
       o.early_receive_time,
       o.latest_receive_time,
       o.immediate,
       o.packed_time,
       o.allocate_rider_time,
       o.delivery_time,
       o.arrival_time,
       o.close_time,
       o.user_ticket_id,
       o.client_ip,
       o.delivery_third_id,
       o.delivery_staff_id,
       o.rider_uid,
       o.platform,
       o.distance,
       o.ride_distance,
       o.balance_enable,
       o.balance_uid,
       o.balance_payable,
       o.balance_real,
       o.personal_balance_real,
       o.company_balance_real,
       o.quota_balance_real,
       o.third_payable,
       o.third_real,
       o.start_longitude,
       o.start_latitude,
       o.arrival_longitude,
       o.arrival_latitude,
       o.family_id,
       o.buyer_id,
       o.presale,
       o.login_type,
       o.update_time
       from t_order as o left join t_stat_order as so on o.id=so.id
       where (date_format(o.time,'%Y-%m-%d')='$do_date'
       or date_format(o.update_time,'%Y-%m-%d')='$do_date'
       or date_format(o.pay_time,'%Y-%m-%d')='$do_date'
       or date_format(so.time,'%Y-%m-%d')='$do_date'
       or date_format(so.modify_time,'%Y-%m-%d')='$do_date' )"

echo "导入 $table start"
sh $script_path/basic_sqoop.sh "$target_path" "$query_sql"
echo "导入 $table end"
