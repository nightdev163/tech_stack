package techStack.springKafka.consumerDemo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListenerAnnotationBeanPostProcessor;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;
import techStack.springKafka.config.TestConfig;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@Component
public class ConsumerDemo {
    @Resource
    private TestConfig testConfig;
    
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("topic1")
//                调用 partitions replicas 会改变主题的partition数量和replicas数量
//                .partitions(10)
//                .replicas(1)
                .build();
    }

    @KafkaListener(id = "myId", topics = "topic1")
    public void listen(String in) {
        
        
        System.out.println(in);
        System.out.println(testConfig.getAa());
        System.out.println(testConfig.getBb());
    }

    @Bean
    public static KafkaListenerAnnotationBeanPostProcessor.AnnotationEnhancer groupIdEnhancer() {
        return (attrs, element) -> {
            attrs.put("groupId", attrs.get("id") + "." + (element instanceof Class 
                    ? ((Class<?>) element).getSimpleName()
                    : ((Method) element).getDeclaringClass().getSimpleName() +  "." + ((Method) element).getName()));
            return attrs;
        };
    }
}
