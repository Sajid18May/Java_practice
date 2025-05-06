package exp;
class X {
    Number method() { return 1; }
}
public class Bx extends X {
    Integer method() { return 2; }

    public static void main(String[] args) {
        Bx bob=new Bx();
        System.out.println(bob.method());
    }// Valid
}
