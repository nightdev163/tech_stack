#!/bin/sh

bin=`dirname "$0"`

. ./config.sh

"/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/bin/java" \
	-XX:+UseG1GC -Xmx536870902 -Xms536870902 -XX:MaxDirectMemorySize=268435458 -XX:MaxMetaspaceSize=268435456 \
	"-Dlog.file=/opt/flink-1.13.5/log/flink-zlh-taskexecutor-2-zlhdeMac-mini.local.log -Dlog4j.configuration=file:/opt/flink-1.13.5/conf/log4j.properties -Dlog4j.configurationFile=file:/opt/flink-1.13.5/conf/log4j.properties -Dlogback.configurationFile=file:/opt/flink-1.13.5/conf/logback.xml" \
	-class path "`manglePathList "/opt/flink-1.13.5/lib/flink-csv-1.13.5.jar:/opt/flink-1.13.5/lib/flink-json-1.13.5.jar:/opt/flink-1.13.5/lib/flink-shaded-zookeeper-3.4.14.jar:/opt/flink-1.13.5/lib/flink-table_2.12-1.13.5.jar:/opt/flink-1.13.5/lib/log4j-1.2-api-2.16.0.jar:/opt/flink-1.13.5/lib/log4j-api-2.16.0.jar:/opt/flink-1.13.5/lib/log4j-core-2.16.0.jar:/opt/flink-1.13.5/lib/log4j-slf4j-impl-2.16.0.jar:/opt/flink-1.13.5/lib/flink-dist_2.12-1.13.5.jar::/opt/hadoop-3.3.1/etc/hadoop::/opt/hbase-2.3.6/conf"`" org.apache.flink.runtime.taskexecutor.TaskManagerRunner " --configDir /opt/flink-1.13.5/conf -D taskmanager.memory.network.min=134217730b -D taskmanager.cpu.cores=1.0 -D taskmanager.memory.task.off-heap.size=0b -D taskmanager.memory.jvm-metaspace.size=268435456b -D external-resources=none -D taskmanager.memory.jvm-overhead.min=201326592b -D taskmanager.memory.framework.off-heap.size=134217728b -D taskmanager.memory.network.max=134217730b -D taskmanager.memory.framework.heap.size=134217728b -D taskmanager.memory.managed.size=536870920b -D taskmanager.memory.task.heap.size=402653174b -D taskmanager.numberOfTaskSlots=1 -D taskmanager.memory.jvm-overhead.max=201326592b" > "/opt/flink-1.13.5/log/flink-zlh-taskexecutor-3-zlhdeMac-mini.local.out" \
	200<&- 2>&1 < /dev/null &
