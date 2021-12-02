
#!/bin/bash
sqoop=/opt/module/sqoop/bin/sqoop

export_data() {
  $sqoop export \
    -D mapreduce.job.queuename=hive \
    --connect "jdbc:mysql://192.168.20.249:3306/xc_data_center?useUnicode=true&characterEncoding=utf-8" \
    --username root \
    --password 123456 \
    --table $2 \
    --num-mappers 1 \
    --export-dir /warehouse/x6mc/$1/$2 \
    --input-fields-terminated-by "\t" \
    --update-mode allowinsert \
    --update-key $3 \
    --input-null-string '\\N' \
    --input-null-non-string '\\N' 
}

echo "ads_to_mysql 导入 start"
export_data "ads" "ads_back_count" "dt"
export_data "ads" "ads_continuity_day_uv_count" "dt"
export_data "ads" "ads_continuity_week_uv_count" "dt"
export_data "ads" "ads_new_user_count" "dt,platform_code_no"
export_data "ads" "ads_silent_count" "dt"
export_data "ads" "ads_user_retention_day_rate" "dt,retention_day"
export_data "ads" "ads_uv_count" "dt,platform"
export_data "ads" "ads_version_count" "dt,version"
export_data "ads" "ads_wastage_count" "dt,inactivity_days"
export_data "ads" "ads_t1_classify_rfm_count" "dt,rmf_tag"
export_data "ads" "ads_t2_classify_rfm_count" "dt,rmf_tag"
export_data "ads" "ads_t3_classify_rfm_count" "dt,r_tag"
export_data "ads" "ads_t4_classify_rfm_count" "dt,rmf_tag"
export_data "ads" "ads_t5_classify_rfm_count" "dt,r_tag"
export_data "ads" "ads_rfm_value_count" "dt,classify_tag"
export_data "ads" "ads_user_classify_count" "dt,classify_tag"
echo "ads_to_mysql 导入 end"
