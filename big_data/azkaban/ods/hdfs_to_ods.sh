#!/bin/bash

hive=/opt/apache-hive-3.1.2-bin/bin/hive

table=$1

ods_table=$2


# 如果是输入的日期按照取输入日期;如果没输入日期取当前时间的前一天
if [ -n "$3" ] ;then
  do_date=$3
else
  do_date=`date -d "-1 day" +%F`
fi

echo do_date

# 源数据目录
origin_path=/origin_data/x6_mc/db/$table/$do_date

base_sql="
SET hive.mapjoin.optimized.hashtable=false;
SET hive.exec.dynamic.partition.mode=nonstrict;
SET hive.input.format=org.apache.hadoop.hive.ql.io.HiveInputFormat;
SET spark.executor.memory=2g;
SET spark.executor.cores=2;
SET spark.executor.instances=16;
"

sql1="load data inpath '$origin_path' OVERWRITE into table x6mc_ods.$ods_table partition(dt='$do_date');"


echo " $ods_table 导入 start"

$hive -e "$base_sql $sql1"

echo " $ods_table 导入 end"

