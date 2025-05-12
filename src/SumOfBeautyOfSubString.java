public class SumOfBeautyOfSubString {
    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }

    public static int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                sum += findBeauty(s.substring(i, j + 1));  // fixed substring range
            }
        }
        return sum;
    }

    public static int findBeauty(String s) {
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 256; i++) {
            if (hash[i] > 0) {
                max = Math.max(max, hash[i]);
                min = Math.min(min, hash[i]);
            }
        }

        return max - min;
    }
}
