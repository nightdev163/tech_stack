#!/bin/bash

source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini
#spark=/opt/spark-3.0.0/bin/spark-submit

if [ -n "$1" ]; then
  # 传入的日期
  dt=$1
else
  # 昨天的日期
  dt=$(date -d '-1 day' +%F)
fi

echo dt

echo " $dt ods层 导入 start"

sh $azkaban_home/ods/hdfs_to_ods.sh t_stat_order ods_order_ext_info "$dt"
#sh $azkaban_home/ods/hdfs_to_ods.sh t_users ods_user_info "$dt"

echo " $dt ods层 导入 end"



