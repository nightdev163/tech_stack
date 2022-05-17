package kafka;

import org.apache.kafka.clients.consumer.ConsumerGroupMetadata;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.state.KeyValueStore;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;

public class Demo {
    
    public void demoLink() {
        StreamsBuilder builder = new StreamsBuilder();
        Properties settings = new Properties();
        settings.put(StreamsConfig.APPLICATION_ID_CONFIG, "kafka-link-test");
        settings.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // KafkaStreams streams = new KafkaStreams(, settings);
    }
    
    public void DemoKStream() {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-wordcount");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        final StreamsBuilder builder = new StreamsBuilder();

        KStream<String, String> source = builder.stream("streams-plaintext-input");
        source.flatMapValues(value -> Arrays.asList(value.toLowerCase(Locale.getDefault()).split("\\W+")))
                .groupBy((key, value) -> value)
                .count(Materialized.<String, Long, KeyValueStore<Bytes, byte[]>>as("counts-store"))
                .toStream()
                .to("streams-wordcount-output", Produced.with(Serdes.String(), Serdes.Long()));

        final Topology topology = builder.build();
        final KafkaStreams streams = new KafkaStreams(topology, props);
        final CountDownLatch latch = new CountDownLatch(1);
        streams.start();
        streams.close();
    }
    
    public void DemoConsumer() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.30.96:9092");
        properties.put("group.id", "test_group");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        String topic = "db-search.search.t_cfg_global";
        consumer.subscribe(Pattern.compile(topic));
        while(true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000L));
            System.out.println("本次轮训到: " + records.count() + " 条");
            for(ConsumerRecord<String, String> record : records) {
                System.out.println("消息来了  topic=" + record.topic() + " partition=" + record.partition() + " offset = " + record.offset() + " value=" + record.value());
            }
        }
    }
    
    public void DemoAssignOffset() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.30.96:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("max.poll.records", 1);
        // properties.put("security.protocol", "PLAINTEXT");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
        String topic = "db-search.search.t_cfg_global";
        TopicPartition tp = new TopicPartition(topic, 0);
        consumer.assign(Collections.singleton(tp));
        System.out.println("本topic下所有的分区: " + consumer.partitionsFor(topic).toString());
        System.out.println("本消费者分配到的分区: " + consumer.assignment().toString());
//        consumer.seek(tp, 5);
//        consumer.seekToBeginning(Arrays.asList(tp));
//        consumer.seekToEnd(Collections.singleton(tp));
        while(true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000L));
            System.out.println("本次轮到: " + records.count() + "条");
            for(ConsumerRecord<String, String> record : records) {
                System.out.println("消息来了  topic=" + record.topic() + " partition=" + record.partition() + " offset = " + record.offset());
                System.out.println("key = " + record.key());
                System.out.println("value = " + record.value());
            }
        }
    }
    
    // from time stamp 1652171109487 2022-05-10 16:25:09.487 and 1652171109548 2022-05-10 16:25:09.548
    public void restartFromFail() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.30.96:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("max.poll.records", 20);
        // properties.put("security.protocol", "PLAINTEXT");

        properties.setProperty("group.id", "test");
        
        // 原文说 records would be considered consumed after they were returned to the user in poll. 
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        
        
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
        String topic = "quickstart-events";
        TopicPartition tp = new TopicPartition(topic, 0);
        consumer.assign(Collections.singleton(tp));
        System.out.println("本topic下所有的分区: " + consumer.partitionsFor(topic).toString());
        System.out.println("本消费者分配到的分区: " + consumer.assignment().toString());
//        consumer.seek(tp, 0);
//        consumer.seekToBeginning(Arrays.asList(tp));
//        consumer.seekToEnd(Collections.singleton(tp));

        while(true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000L));
            System.out.println("本次轮到: " + records.count() + "条");
            for(ConsumerRecord<String, String> record : records) {
                System.out.println("消息来了  topic=" + record.topic() + " partition=" + record.partition() + " offset = " + record.offset());
                System.out.println("key = " + record.key());
                System.out.println("value = " + record.value());
            }
        }
    }
}
