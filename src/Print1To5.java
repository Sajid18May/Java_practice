public class Print1To5 {
    public static void main(String[] args) {
        printNumber(5);
        //printNumberRev(5);
    }

    private static void printNumber(int n) {
        if(n==0)
            return;

        printNumber(n-1);
        System.out.println(n);
    }

}
