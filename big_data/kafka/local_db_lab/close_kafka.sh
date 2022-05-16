#!/bin/bash

cd /opt/kafka_2.13-3.0.0
bin/zookeeper-server-stop.sh

bin/kafka-server-stop.sh
