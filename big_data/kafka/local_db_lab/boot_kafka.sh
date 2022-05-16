#!/bin/bash

cd /opt/kafka_2.13-3.0.0
nohup bin/zookeeper-server-start.sh config/zookeeper.properties &

nohup bin/kafka-server-start.sh config/server.properties &
