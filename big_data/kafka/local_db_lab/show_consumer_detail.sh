#!/bin/sh

cd /opt/kafka_2.13-3.0.0 
bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --describe --group test-consumer-group
