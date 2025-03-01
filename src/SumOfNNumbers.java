public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(SumRe(8,0));
    }

    private static int SumRe(int n, int sum) {
        if(n==0) {
            return sum;
        }
        sum+=n;
        return SumRe(n-1,sum);
    }
}
