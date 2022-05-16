package Kafka;

import Deserialization.KafkaJsonDeserialization;
import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.RuntimeExecutionMode;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.connector.kafka.sink.KafkaRecordSerializationSchema;
import org.apache.flink.connector.kafka.sink.KafkaSink;
import org.apache.flink.connector.kafka.source.KafkaSource;
import org.apache.flink.connector.kafka.source.enumerator.initializer.OffsetsInitializer;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;
import org.apache.flink.streaming.api.functions.sink.filesystem.rollingpolicies.DefaultRollingPolicy;
import org.apache.kafka.common.TopicPartition;
import org.apache.flink.streaming.api.functions.sink.filesystem.BucketAssigner;
import org.apache.flink.streaming.api.functions.sink.filesystem.bucketassigners.SimpleVersionedStringSerializer;
import org.apache.flink.core.fs.Path;
import FileSink.DemoBucketAssigner;


import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Demo implements Serializable {
    private static final long serialVersionUID = 2347464086L;

    public void basicLink() throws Exception {

        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics("db-search.search.t_cfg_global")
                .setGroupId("my-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();

//        KafkaSink<String> sink = KafkaSink.<String>builder()
//                .setBootstrapServers("localhost:9092")
//                .setRecordSerializer(KafkaRecordSerializationSchema.builder()
//                    .setTopic("sink_t_cfg_global")
//                    .setValueSerializationSchema(new SimpleStringSchema())
//                    .build()
//                )
//                .build();

        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
//        env.setRuntimeMode(RuntimeExecutionMode.BATCH);
//        env.setRuntimeMode(RuntimeExecutionMode.STREAMING);
//        stream.sinkTo(sink);

        stream.print();
        env.execute();
    }

    public void sinkToKafka() throws Exception {
        System.out.println("enter sinkToKafka");
        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics("db-search.search.t_cfg_global")
                .setGroupId("my-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();

        KafkaSink<String> sink = KafkaSink.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setRecordSerializer(KafkaRecordSerializationSchema.builder()
                        .setTopic("sink_t_cfg_global")
                        .setValueSerializationSchema(new SimpleStringSchema())
                        .build()
                )
                .build();

        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        env.setRuntimeMode(RuntimeExecutionMode.STREAMING);
        stream.sinkTo(sink);
        env.execute();

        System.out.println("leave sinkToKafka");
    }

    public void commitAndCheckpoint() throws Exception {
        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics("db-search.search.t_cfg_global")
                .setGroupId("test-consumer-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.enableCheckpointing(10000);
        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);   // this is default
        env.getCheckpointConfig().setCheckpointStorage("file:///tmp/flinkStorage");
        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        stream.print();
        env.execute();

    }


    public void boundedDemo() throws Exception {
        
        String topic = "db-search.search.t_cfg_global";
        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics(topic)
                .setGroupId("test-consumer-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setBounded(OffsetsInitializer.offsets(new HashMap<TopicPartition, Long>() {{
                    put(new TopicPartition(topic, 0), 100L);
                }}))
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setRuntimeMode(RuntimeExecutionMode.BATCH);

        // checkpoint在批处理中不生效
//        env.enableCheckpointing(10000);
//        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);   // this is default
//        env.getCheckpointConfig().setCheckpointStorage("file:///tmp/flinkStorage");

        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        stream.print();
        env.execute();
    }

    public void deserializeObject() throws Exception {
        String topic = "db-search.search.t_cfg_global";
        KafkaSource<JSONObject> source = KafkaSource.<JSONObject>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics(topic)
                .setGroupId("test-consumer-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setBounded(OffsetsInitializer.offsets(new HashMap<TopicPartition, Long>() {{
                    put(new TopicPartition(topic, 0), 100L);
                }}))
                .setDeserializer(new KafkaJsonDeserialization())
                .build();
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setRuntimeMode(RuntimeExecutionMode.BATCH);

        DataStream<JSONObject> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        stream.print();
        env.execute();
    }


    public void sinkToKafkaBatch() throws Exception {
        String topic = "db-search.search.t_cfg_global";
        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics(topic)
                .setGroupId("test-consumer-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setBounded(OffsetsInitializer.offsets(new HashMap<TopicPartition, Long>() {{
                    put(new TopicPartition(topic, 0), 100L);
                }}))
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();
        

        KafkaSink<String> sink = KafkaSink.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setRecordSerializer(KafkaRecordSerializationSchema.builder()
                        .setTopic("sink_t_cfg_global")
                        .setValueSerializationSchema(new SimpleStringSchema())
                        .build()
                )
                .build();

        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setRuntimeMode(RuntimeExecutionMode.BATCH);
        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        stream.sinkTo(sink);
        env.execute();

        System.out.println("leave sinkToKafka");
    }
    
    public void sinkToKafkaHadoop() throws Exception {
        System.out.println("enter sinkToKafkaHadoop demo");
        
        String topic = "db-search.search.t_cfg_global";
        KafkaSource<String> source = KafkaSource.<String>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics(topic)
                .setGroupId("test-consumer-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setBounded(OffsetsInitializer.offsets(new HashMap<TopicPartition, Long>() {{
                    put(new TopicPartition(topic, 0), 100L);
                }}))
                .setValueOnlyDeserializer(new SimpleStringSchema())
                .build();
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setRuntimeMode(RuntimeExecutionMode.BATCH);
        env.setParallelism(2);
        DataStream<String> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "kafka source");
        String outputPath = "hdfs://localhost:9900//flink_demo//sinkToKafkaHadoop";
        SingleOutputStreamOperator<String> map = stream.map(new MapFunction<String, String>() {
            @Override
            public String map(String s) throws Exception {
                return s + "-gpf";
            }
        });
        map.print("sinkToKafkaHadoop demo");
        
        DefaultRollingPolicy<String, String> defaultRollingPolicy = DefaultRollingPolicy.builder()
                .withInactivityInterval(TimeUnit.SECONDS.toMillis(10))
                .withRolloverInterval(TimeUnit.SECONDS.toMillis(30))
                .withMaxPartSize(1024 * 1024 * 1024)
                .build();
        final StreamingFileSink<String> sink = StreamingFileSink
                .forRowFormat(new Path(outputPath), new SimpleStringEncoder<String>("UTF-8"))
                .withRollingPolicy(defaultRollingPolicy)
                .withBucketAssigner(new DemoBucketAssigner())
                .withBucketCheckInterval(10000L)
                .build();
        map.addSink(sink);
        env.execute();
        System.out.println("leave sinkToKafkaHadoop");
    }
}
