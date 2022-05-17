package kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;

import java.util.Collections;
import java.util.Properties;

public class RunnerDemo {
    public void run() {
        System.out.println("Main thread is -" + Thread.currentThread().getName());
        
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.30.96:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("max.poll.records", 1);
        // properties.put("security.protocol", "PLAINTEXT");

        properties.setProperty("group.id", "test");

        // 原文说 records would be considered consumed after they were returned to the user in poll. 
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
        String topic = "quickstart-events";
        TopicPartition tp = new TopicPartition(topic, 0);
        consumer.assign(Collections.singleton(tp));
        consumer.seek(tp, 0);
        
        KafkaConsumerRunner runner = new KafkaConsumerRunner(consumer);
        
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                runner.shutdown();
            }
        });
        
        Thread t = new Thread(runner);
        t.start();
    }
}
