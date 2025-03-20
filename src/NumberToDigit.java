public class NumberToDigit {
    public static void main(String[] args) {
        int n=45325;
        printDigits(n);
    }
    private static void printDigits(int n) {
        if(n==0)return;
        int d=n%10;
        printDigits(n/10);
        System.out.println(d);
    }
}
