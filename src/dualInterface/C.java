package dualInterface;

public class C implements A,B{

    public static void main(String[] args) {
        System.out.println(333);
        C c1=new C();
        c1.show();
    }
    @Override
    public void show() {
        B.super.show();
    }


}
