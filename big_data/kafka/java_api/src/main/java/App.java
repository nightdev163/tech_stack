import kafka.Demo;
import kafka.KafkaConsumerRunner;
import kafka.RunnerDemo;

public class App {
    public static void main(String[] args) throws Exception  {
//        Demo demo = new Demo();
//        demo.restartFromFail();

        RunnerDemo demo = new RunnerDemo();
        demo.run();
    }
}
