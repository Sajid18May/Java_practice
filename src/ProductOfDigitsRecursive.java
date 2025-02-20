public class ProductOfDigitsRecursive {
    public static void main(String[] args) {
        System.out.println(productOfDigit(123));
    }

    private static int productOfDigit(int n) {
        if(n==0) return 1;
        return (n%10)*productOfDigit(n/10);
    }
}
