package dualInterface;

public interface B {
    default void show(){
        System.out.println("Hello");
    }
}
