#! /bin/bash
source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini
table=t_stat_order
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
       so.id,
       so.uid,
       so.repo_id,
       so.platform_id,
       so.is_old_user,
       so.is_new_regist_user,
       so.is_new_paid_user,
       so.order_count_before,
       so.first_pay_time,
       so.last_pay_time,
       so.create_time,
       so.pay_time,
       so.allocate_rider_time,
       so.delivery_time,
       so.arrival_time,
       so.latest_receive_time,
       so.timeout_second,
       so.is_immediate,
       so.is_dada,
       so.is_long,
       so.is_timeout,
       so.is_despair,
       so.is_illegal_start,
       so.is_illegal_arrival,
       so.distance,
       so.distance_ride,
       so.distance_start,
       so.distance_arrival,
       so.rider_id,
       so.rider_uid,
       so.rider_name,
       so.original_money,
       so.vip_subsidy,
       so.limit_subsidy,
       so.purchase_subsidy,
       so.gift_subsidy,
       so.cart_money,
       so.manzhe_subsidy,
       so.manjian_subsidy,
       so.order_money,
       so.ticket_subsidy,
       so.payable_money,
       so.refund_money,
       so.refund_weight_money,
       so.real_money,
       so.cost_money,
       so.refund_type,
       so.duplicate_order,
       so.is_self_pickup,
       so.is_self_pickup_viewed,
       so.converted_count,
       so.is_vip,
       so.wechat_order_money,
       so.alipay_order_money,
       so.balance_order_money,
       so.card_order_money,
       so.community_id,
       so.is_community,
       so.is_viewed,
       so.time,
       so.modify_time,
       so.delivery_fee
       from  t_stat_order as so  join t_order as o  on so.id=o.id
       where (date_format(o.time,'%Y-%m-%d')='$do_date' or date_format(o.update_time,'%Y-%m-%d')='$do_date' or date_format(so.time,'%Y-%m-%d')='$do_date' or date_format(so.modify_time,'%Y-%m-%d')='$do_date' )"

echo "导入 $table start"
sh $script_path/basic_sqoop.sh "$target_path" "$query_sql"
echo "导入 $table end"
