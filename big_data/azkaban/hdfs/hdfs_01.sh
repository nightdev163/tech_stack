#! /bin/bash

if [ -n "$1" ]; then
  # 传入的日期
  dt=$1
else
  # 昨天的日期
  dt=$(date -v-1d +"%Y-%m-%d")
fi

source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini

#echo "hdfs_01 $dt hdfs层 导入 start"


#sh $azkaban_home/hdfs/t_users_all.sh "$dt"

sh $azkaban_home/hdfs/t_stat_order.sh "$dt"
#sh $azkaban_home/hdfs/t_order.sh "$dt"


#echo "hdfs_01 $dt hdfs层 导入 start"
