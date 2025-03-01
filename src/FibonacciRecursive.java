public class FibonacciRecursive {
    public static void main(String[] args) {
        fibonacciRecursive(7);
    }

    private static void fibonacciRecursive(int n) {
        if(n==-1){
            return;
        }
        fibonacciRecursive(n-1);
        System.out.println(fibonacciRecursiveHelper(n));
    }

    private static int fibonacciRecursiveHelper(int n) {
        if(n<=1){
            return n;
        }
        return fibonacciRecursiveHelper(n-1)+fibonacciRecursiveHelper(n-2);
    }
}
