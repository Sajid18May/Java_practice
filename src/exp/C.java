package exp;
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }

public class C implements A, B {
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
    }
    public void show() { A.super.show();
        //
        }  // Resolves ambiguity
}

