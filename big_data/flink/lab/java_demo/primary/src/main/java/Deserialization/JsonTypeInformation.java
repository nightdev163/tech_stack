package Deserialization;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.ExecutionConfig;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.common.typeutils.TypeSerializer;

import java.util.Objects;

public class JsonTypeInformation extends TypeInformation<JSONObject> {

    private final TypeSerializer<JSONObject> serializer;

    private final Class<JSONObject> clazz;

    public JsonTypeInformation() {
        this.serializer = new JsonTypeSerializer();
        this.clazz = JSONObject.class;
    }

    @Override
    public boolean isBasicType() {
        return false;
    }

    @Override
    public boolean isTupleType() {
        return false;
    }

    @Override
    public int getArity() {
        return -1;
    }

    @Override
    public int getTotalFields() {
        return -1;
    }

    @Override
    public Class<JSONObject> getTypeClass() {
        return JSONObject.class;
    }

    @Override
    public boolean isKeyType() {
        return false;
    }

    @Override
    public TypeSerializer<JSONObject> createSerializer(ExecutionConfig executionConfig) {
        return this.serializer;
    }

    @Override
    public String toString() {
        return this.getTypeClass().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof JsonTypeInformation)) {
            return false;
        } else {
            JsonTypeInformation other = (JsonTypeInformation) obj;
            return other.canEqual(this) && this.clazz == other.clazz && this.serializer.equals(other.serializer);
        }
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.clazz) + Objects.hashCode(this.serializer);
    }

    @Override
    public boolean canEqual(Object o) {
        return o instanceof JsonTypeInformation;
    }
}
