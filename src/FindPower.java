public class FindPower {
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        double res = 1;
        long nn = n;
        if (nn < 0) nn *= -1;
        if (n == 0) {
            return 1;
        }

        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn /= 2;
            } else {
                res *= x;
                nn -= 1;
            }
        }
        if (n < 0) res = (1.0) / res;
        return res;
    }
}
