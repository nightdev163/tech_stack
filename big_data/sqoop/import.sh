#!/bin/sh
#sqoop import --connect jdbc:mysql://127.0.0.1:3306/search?UseStreamingResults=false&useCursorFetch=true&defaultFetchSize=10000
#-Dmapreduce.output.fileoutputformat.compress=true -Dmapreduce.output.fileoutputformat.compress.codec=com.hadoop.compression.lzo.LzopCodec \
sqoop import \
--connect 'jdbc:mysql://127.0.0.1:3306/search?useUnicode=true&characterEncoding=utf-8' \
--driver com.mysql.jdbc.Driver \
--username root \
--password 123456 \
-m 1 \
--query 'SELECT * FROM t_cfg_global where true and $CONDITIONS' \
--target-dir /user/hive/hive_lab_ext/t_cfg_global \
--hive-drop-import-delims \
--fields-terminated-by '\t' \
--compress \
--compression-codec lzop \
--null-string '\\N' \
--null-non-string '\\N' \
