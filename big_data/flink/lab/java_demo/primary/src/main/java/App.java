import Kafka.Demo;

public class App {
    
    public static void main(String[] args) throws Exception  {
        Demo demo = new Demo();
        demo.sinkToKafkaHadoop();
    }
}
