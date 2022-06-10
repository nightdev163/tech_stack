package jsonMappingsDemo;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.kafka.support.serializer.ParseStringDeserializer;
import org.springframework.kafka.support.serializer.ToStringSerializer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @Bean
    public ConsumerFactory<?, ?> kafkaConsumerFactory() {
        Map<String, Object> consumerProperties = new HashMap<>();
        consumerProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        consumerProperties.put(JsonDeserializer.TYPE_MAPPINGS, "Cat:jsonMappingsDemo.Cat,Hat:jsonMappingsDemo.Hat");
        consumerProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        consumerProperties.put(JsonDeserializer.TRUSTED_PACKAGES, "jsonMappingsDemo");
        return new DefaultKafkaConsumerFactory<>(consumerProperties);
    }

    @Bean
    public ProducerFactory<?, ?> kafkaProducerFactory() {
        Map<String, Object> producerProperties = new HashMap<>();
        producerProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        producerProperties.put(JsonSerializer.TYPE_MAPPINGS, "Cat:jsonMappingsDemo.Cat,Hat:jsonMappingsDemo.Hat");
        producerProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        DefaultKafkaProducerFactory<?,?> factory = new DefaultKafkaProducerFactory<>(producerProperties);
        return factory;
    }

    @KafkaListener(id="catConsumer", topics="mappingDemoCat")
    public void listen(Cat cat) {
        String str = "name " + cat.getName() + " age" + cat.getAge();
        System.out.println("Received " + str);
    }

    @KafkaListener(id="hatConsumer", topics="mappingDemoHat")
    public void listen(Hat hat) {
        String str = "name " + hat.getName() + " price" + hat.getPrice();
        System.out.println("Received " + str);
    }

    
    
    // 已经可以发送
    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, Cat> template) {
        return args->template.send("mappingDemoCat",  new Cat("this is cat", 3));
    }

    // 已经可以发送
    @Bean
    public ApplicationRunner runner2(KafkaTemplate<String, Hat> template) {
        return args->template.send("mappingDemoHat",  new Hat("this is hat", 5));
    }
}
