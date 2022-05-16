package FileSink;

import org.apache.flink.core.io.SimpleVersionedSerializer;
import org.apache.flink.streaming.api.functions.sink.filesystem.BucketAssigner;
import org.apache.flink.streaming.api.functions.sink.filesystem.bucketassigners.SimpleVersionedStringSerializer;

public class DemoBucketAssigner implements BucketAssigner<String, String> {

    @Override
    public String getBucketId(String value, Context context) {
        String[] array = value.split(" ");
        // 2020-11-09 insert 10
        return array[0];
    }

    @Override
    public SimpleVersionedSerializer<String> getSerializer() {
        return SimpleVersionedStringSerializer.INSTANCE;
    }
}
