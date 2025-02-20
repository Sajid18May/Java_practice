public class RecursiveSumOfDigits {
    public static void main(String[] args) {
        System.out.println(recursiveSumOfDigit(1234));
    }

    private static int recursiveSumOfDigit(int n) {
        if(n==0)
           return 0;
        return (n%10)+recursiveSumOfDigit(n/=10);
    }
}
