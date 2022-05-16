package Deserialization;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.annotation.Internal;
import org.apache.flink.api.common.typeutils.TypeSerializer;
import org.apache.flink.api.common.typeutils.TypeSerializerSchemaCompatibility;
import org.apache.flink.api.common.typeutils.TypeSerializerSnapshot;
import org.apache.flink.api.common.typeutils.base.TypeSerializerSingleton;
import org.apache.flink.core.memory.DataInputView;
import org.apache.flink.core.memory.DataOutputView;
import org.apache.flink.types.StringValue;

import java.io.IOException;

@Internal
public class JsonTypeSerializer extends TypeSerializerSingleton<JSONObject> {

    @Override
    public boolean isImmutableType() {
        return true;
    }

    @Override
    public JSONObject createInstance() {
        return new JSONObject();
    }

    @Override
    public JSONObject copy(JSONObject jsonObject) {
        String strJson = jsonObject.toJSONString();
        return JSONObject.parseObject(strJson);
    }

    @Override
    public JSONObject copy(JSONObject jsonObject, JSONObject t1) {
        String strJson = jsonObject.toJSONString();
        return JSONObject.parseObject(strJson);
    }

    @Override
    public int getLength() {
        return -1;
    }

    @Override
    public void serialize(JSONObject jsonObject, DataOutputView dataOutputView) throws IOException {
        StringValue.writeString(jsonObject.toJSONString(), dataOutputView);
    }

    @Override
    public JSONObject deserialize(DataInputView dataInputView) throws IOException {
        String jsonStr = StringValue.readString(dataInputView);
        return JSONObject.parseObject(jsonStr);
    }

    @Override
    public JSONObject deserialize(JSONObject jsonObject, DataInputView dataInputView) throws IOException {
        return this.deserialize(dataInputView);
    }

    @Override
    public void copy(DataInputView dataInputView, DataOutputView dataOutputView) throws IOException {
        String jsonStr = StringValue.readString(dataInputView);
        StringValue.writeString(jsonStr, dataOutputView);
    }

    @Override
    public TypeSerializerSnapshot<JSONObject> snapshotConfiguration() {
        return new JsonTypeSerializer.JsonTypeSerializerSnapshot();
    }

    public static final class JsonTypeSerializerSnapshot implements TypeSerializerSnapshot<JSONObject> {
        private static final int CURRENT_VERSION = 1;

        public JsonTypeSerializerSnapshot() {

        }

        @Override
        public int getCurrentVersion() {
            return CURRENT_VERSION;
        }

        @Override
        public void writeSnapshot(DataOutputView dataOutputView) throws IOException {

        }

        @Override
        public void readSnapshot(int i, DataInputView dataInputView, ClassLoader classLoader) throws IOException {

        }

        @Override
        public TypeSerializer<JSONObject> restoreSerializer() {
            return null;
        }

        @Override
        public TypeSerializerSchemaCompatibility<JSONObject> resolveSchemaCompatibility(TypeSerializer<JSONObject> typeSerializer) {
            return null;
        }
    }
}
