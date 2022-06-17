package resolverDemo;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Setter
@Getter
public class Cat {

    private String name;
    private int age;

    @ConstructorProperties({"n","a"})
    public Cat(String n, int a) {
        this.name = n;
        this.age = a;
    }
}
