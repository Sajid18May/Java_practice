public class NumberSwap {
    public static void main(String[] args) {
        int a=12;
        int b=15;
        System.out.println(a+" "+b);
        b=a+b-(a=b);
        System.out.println(a+" "+b);
    }
}
