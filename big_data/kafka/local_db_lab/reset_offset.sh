#!/bin/sh

/opt/kafka_2.13-3.0.0/bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --group test-consumer-group --reset-offsets --topic db-search.search.t_cfg_global --to-earliest --execute
