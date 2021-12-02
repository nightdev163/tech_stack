#! /bin/bash
source /Users/zlh/github/tech_stack/big_data/azkaban/config/config_local.ini
sqoop=/opt/sqoop-1.4.6.bin__hadoop-2.0.4-alpha/bin/sqoop

target_path=$1
query_sql=$2

# sqoop导入
$sqoop import \
  --connect $jdbc_url \
  --driver com.mysql.jdbc.Driver \
  --username $username \
  --password $password \
  --target-dir $target_path \
  --delete-target-dir \
  --query "$query_sql and \$CONDITIONS" \
  --num-mappers 1 \
  --hive-drop-import-delims \
  --fields-terminated-by '\t' \
  --compress \
  --compression-codec lzop \
  --null-string '\\N' \
  --null-non-string '\\N'

# lzo索引创建
hadoop jar /opt/hadoop-3.3.1/share/hadoop/common/hadoop-lzo-0.4.21.jar com.hadoop.compression.lzo.DistributedLzoIndexer $target_path
