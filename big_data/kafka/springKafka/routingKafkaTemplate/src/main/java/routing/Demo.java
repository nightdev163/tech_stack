package routing;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.core.RoutingKafkaTemplate;
import sun.awt.image.ImageWatched;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

@SpringBootApplication
public class Demo {
    
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
    
    @Bean
    public RoutingKafkaTemplate routingTemplate(
            GenericApplicationContext context, ProducerFactory<Object, Object> pf) {
        
        Map<String, Object> configs = new HashMap<>(pf.getConfigurationProperties());
        configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class);
        DefaultKafkaProducerFactory<Object, Object> bytesPF = new DefaultKafkaProducerFactory<>(configs);
        context.registerBean(DefaultKafkaProducerFactory.class, "bytesPF", bytesPF);
        
        Map<Pattern, ProducerFactory<Object, Object>> map = new LinkedHashMap<>();
        map.put(Pattern.compile("two"), bytesPF);
        map.put(Pattern.compile(".+"), pf);
        return new RoutingKafkaTemplate(map);
    }
    
    @Bean
    public ApplicationRunner runner(RoutingKafkaTemplate routingTemplate) {
        return args -> {
            routingTemplate.send("one", "thing1 in topic one");
            routingTemplate.send("two", "thing1 in topic two".getBytes());
        };
    }
}
