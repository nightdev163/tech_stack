#/bin/sh

#这个命令用来获取主题下每个分区的最早（小）偏移量

/opt/kafka_2.13-3.0.0/bin/kafka-run-class.sh kafka.tools.GetOffsetShell --broker-list localhost:9092 --topic db-search.search.t_cfg_global --time -2

