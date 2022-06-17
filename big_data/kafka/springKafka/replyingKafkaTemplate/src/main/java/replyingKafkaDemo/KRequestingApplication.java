package replyingKafkaDemo;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.requestreply.CorrelationKey;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.requestreply.RequestReplyFuture;
import org.springframework.kafka.support.SendResult;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@SpringBootApplication
public class KRequestingApplication {
    // Q:这个样例的业务情景是什么?
    // A: ReplyingKafkaTemplate 先给 kRequest 主题发一个消息，然后其他进程收到这个消息后，返还一个结果到 kReplies主题，ReplyingKafkaTemplate 在接收这个结果
    // ReplyingKafkaTemplate 发出和接收的消息里，消息的 header 里要有一个 correlationId 字段，作为消息和消息回馈的想对应的验证
    // 这个样例未完成,原因是还不知道如何往header 里写 correlationId 验证字段
    public static void main(String[] args) {
        // AggregatingReplyingKafkaTemplate
        SpringApplication.run(KRequestingApplication.class, args).close();
    }
    
    @Bean
    public ApplicationRunner runner(ReplyingKafkaTemplate<String, String, String> template) {
        return args -> {
            ProducerRecord<String, String> record = new ProducerRecord<>("kRequest", "foo");
            RequestReplyFuture<String, String, String> replyFuture = template.sendAndReceive(record, Duration.ofSeconds(120));
            SendResult<String, String> sendResult = replyFuture.getSendFuture().get(60, TimeUnit.SECONDS);
            System.out.println("Sent ok: " + sendResult.getRecordMetadata());
            ConsumerRecord<String, String> consumerRecord = replyFuture.get(60, TimeUnit.SECONDS);
            System.out.println("Return value: " + consumerRecord.value());
        };
    }
    
//    UUID uuid = UUID.randomUUID();
//    byte[] bytes = new byte[16]; // NOSONAR magic #
//    ByteBuffer bb = ByteBuffer.wrap(bytes);
//		bb.putLong(uuid.getMostSignificantBits());
//		bb.putLong(uuid.getLeastSignificantBits());
//		return new CorrelationKey(bytes);
    
    @Bean
    public ReplyingKafkaTemplate<String, String, String> replyingTemplate(
            ProducerFactory<String, String> pf,
            ConcurrentMessageListenerContainer<String, String> repliesContainer
    ) {
        return new ReplyingKafkaTemplate<>(pf, repliesContainer);
    }
    
    @Bean
    public ConcurrentMessageListenerContainer<String, String> repliesContainer(
            ConcurrentKafkaListenerContainerFactory<String, String> containerFactory
    ) {
        ConcurrentMessageListenerContainer<String, String> repliesContainer =
                containerFactory.createContainer("kReplies");
        repliesContainer.getContainerProperties().setGroupId("repliesGroup");
        repliesContainer.setAutoStartup(false);
        return repliesContainer;
    }
    
    @Bean
    public NewTopic kRequest() { 
        return TopicBuilder.name("kRequest")
                .partitions(10)
                .replicas(2)
                .build();
    }
    
    @Bean
    public NewTopic kReplies() {
        return TopicBuilder.name("kReplies")
                .partitions(10)
                .replicas(2)
                .build();
    }
}
