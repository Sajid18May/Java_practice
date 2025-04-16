public class SqrtWithBS {
    public static void main(String[] args) {
        System.out.println(sqrtN(66));
    }
    public static int sqrtN(long n) {
        int low = 1, high =(int) n;

        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= n) {

                low = (int)(mid + 1);
            } else {

                high = (int)(mid - 1);
            }
        }
        return high;
    }
}
