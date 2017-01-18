package func_interface;

@FunctionalInterface
public interface MyInterface {
    void doSomething();

    default void doSomething2() {
        System.out.println("MyInterface.doSomething2");
    }
}
