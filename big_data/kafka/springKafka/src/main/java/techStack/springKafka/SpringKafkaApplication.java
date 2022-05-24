package techStack.springKafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import techStack.springKafka.config.TestConfig;

@SpringBootApplication
public class SpringKafkaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}
	
	

//	@Bean
//	public ApplicationRunner runner(KafkaTemplate<String, String> template) {
//		return args -> {
//			template.send("topic1", "test");
//		};
//	}
	
}
