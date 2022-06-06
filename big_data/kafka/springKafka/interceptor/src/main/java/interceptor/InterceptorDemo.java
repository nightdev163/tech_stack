package interceptor;

import oracle.jvm.hotspot.jfr.Producer;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class InterceptorDemo {
    public static void main(String[] args) {
        SpringApplication.run(InterceptorDemo.class, args);
    }
    
    @Bean
    public ConsumerFactory<?, ?> kafkaConsumerFactory(SomeBean someBean) {
        Map<String, Object> consumerProperties = new HashMap<>();
        consumerProperties.put(ConsumerConfig.INTERCEPTOR_CLASSES_CONFIG, MyConsumerInterceptor.class.getName());
        consumerProperties.put("some.bean", someBean);
        consumerProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        consumerProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return new DefaultKafkaConsumerFactory<>(consumerProperties);
    }
    
    @Bean
    public ProducerFactory<?, ?> kafkaProducerFactory(SomeBean someBean) {
        Map<String, Object> producerProperties = new HashMap<>();
        // producerProperties.put(..., ...)
        // ...
        // Map<String, Object> producerProperties = properties.buildProducerProperties();
        
        producerProperties.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG, MyProducerInterceptor.class.getName());
        producerProperties.put("some.bean", someBean);
        
        
        producerProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        producerProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        DefaultKafkaProducerFactory<?,?> factory = new DefaultKafkaProducerFactory<>(producerProperties);
        return factory;
    } 
    
    @Bean SomeBean someBean() {
        return new SomeBean();
    }
    
    @KafkaListener(id="kgk897", topics="kgh897")
    public void listen(String in) {
        System.out.println("Received " + in);
    }
    
    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args->template.send("kgh897", "test");
    }
    
    @Bean
    public NewTopic kRequest() {
        return TopicBuilder.name("pause.resume.topic")
                .partitions(2)
                .replicas(1)
                .build();
    }
}