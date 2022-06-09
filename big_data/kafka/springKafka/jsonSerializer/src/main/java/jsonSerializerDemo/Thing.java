package jsonSerializerDemo;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Setter
@Getter
public class Thing {
    private int weight;
    private int volume;
    
    @ConstructorProperties({"weight","volume"})
    public Thing(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }
}
