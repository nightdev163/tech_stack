#/bin/sh

mvn archetype:generate \
    -DarchetypeGroupId=org.apache.kafka \
    -DarchetypeArtifactId=streams-quickstart-java \
    -DarchetypeVersion=3.0.0 \
    -DgroupId=kafka_examples \
    -DartifactId=kafka_examples \
    -Dversion=0.1 \
    -Dpackage=myapps
