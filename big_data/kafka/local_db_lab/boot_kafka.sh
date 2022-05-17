#!/bin/bash

nohup /opt/kafka_2.13-3.0.0/bin/zookeeper-server-start.sh config/zookeeper.properties &
nohup /opt/kafka_2.13-3.0.0/bin/kafka-server-start.sh config/server.properties &
