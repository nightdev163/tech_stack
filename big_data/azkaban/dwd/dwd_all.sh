#!/bin/bash

hive=/opt/module/hive/bin/hive

if [ -n "$1" ]; then
  # 传入的日期
  do_date=$1
else
  # 昨天的日期
  do_date=$(date -d '-1 day' +%F)
fi



base_sql="
SET mapreduce.job.queuename=hive;
SET hive.mapjoin.optimized.hashtable=false;
SET hive.exec.dynamic.partition.mode=nonstrict;
SET hive.input.format=org.apache.hadoop.hive.ql.io.HiveInputFormat;
SET spark.executor.memory=2g;
SET spark.executor.cores=2;
SET spark.executor.instances=16;
"


# 增量数据处理
query_sql="
    
"

echo " $do_date dwd层 导入 start"
$hive -e "$base_sql $query_sql"
echo " $do_date dwd层 导入 end"

