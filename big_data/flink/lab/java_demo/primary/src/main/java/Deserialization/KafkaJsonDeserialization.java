package Deserialization;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.connector.kafka.source.reader.deserializer.KafkaRecordDeserializationSchema;
import org.apache.flink.util.Collector;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class KafkaJsonDeserialization implements KafkaRecordDeserializationSchema<JSONObject> {

    @Override
    public void deserialize(ConsumerRecord<byte[], byte[]> consumerRecord, Collector<JSONObject> collector) throws IOException {
        byte[] message = consumerRecord.value();
        String strJsonValue = new String(message, StandardCharsets.UTF_8);
        JSONObject json = JSONObject.parseObject(strJsonValue);
        collector.collect(json);
    }

    @Override
    public TypeInformation<JSONObject> getProducedType() {
        
        return new JsonTypeInformation();
    }
}
