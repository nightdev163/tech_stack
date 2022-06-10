package jsonMappingsDemo;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Setter
@Getter
public class Hat {

    private String name;
    private int price;

    @ConstructorProperties({"n","p"})
    public Hat(String n, int p) {
        this.name = n;
        this.price = p;
    }
}
