package kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class KafkaConsumerRunner implements Runnable {
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final KafkaConsumer consumer;

    public KafkaConsumerRunner(KafkaConsumer consumer) {
        this.consumer = consumer;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        try {
            while (!closed.get()) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(10000));
                // Handle new records
                System.out.println("本次轮到: " + records.count() + "条");
                for(ConsumerRecord<String, String> record : records) {
                    System.out.println("消息来了  topic=" + record.topic() + " partition=" + record.partition() + " offset = " + record.offset());
                    System.out.println("key = " + record.key());
                    System.out.println("value = " + record.value());
                    try {
                        TimeUnit.MILLISECONDS.sleep(5000L);    
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (WakeupException e) {
            if(!closed.get()) throw e;
        } finally {
            consumer.close();
        }
    }
    
    public void shutdown() {
        System.out.println("KafkaConsumerRunner shutdown");
        closed.set(true);
        consumer.wakeup();
    }
}
