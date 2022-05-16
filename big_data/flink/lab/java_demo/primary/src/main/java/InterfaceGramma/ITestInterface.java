package InterfaceGramma;

public interface ITestInterface {
    void func(int a, int b);
    
    default void func2(int a, int b, Integer c) {
        c = a + b;
    }
}
