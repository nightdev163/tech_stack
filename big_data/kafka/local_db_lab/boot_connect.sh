#!/bin/bash

cd /opt/kafka_2.13-3.0.0

bin/connect-standalone.sh config/connect-standalone.properties config/jdbc.properties 
