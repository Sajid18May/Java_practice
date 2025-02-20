public class PassingNumberRecursive {
    public static void main(String[] args) {
        System.out.println("Printing Numbers from 1 to 10");
        printNumber(10);
    }

    private static void printNumber(int n) {
        if(n==0){
            return;
        }
        printNumber(--n);
        System.out.println(n+1);
    }

}
