public class CountGoodNumbers {
    public static void main(String[] args) {
        long n=9;
        System.out.println(countGoodNumbers(n));
    }
    private static final long MOD = 1000000007L;

    public static int countGoodNumbers(long n) {
        long even = n / 2;
        long odd = n - even;
        long pow5 = mPow(5, odd);
        long pow4 = mPow(4, even);
        return (int)((pow5 * pow4) % MOD);
    }

    private static long mPow(long x, long n) {
        long res = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {// alternative for %2
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;// alternative for /2
        }

        return res;
    }
}
