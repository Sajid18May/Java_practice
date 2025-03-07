import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 7, 5, 6, 6, 7, 8, 8, 9, 9};
        int k = 17;
        int longest = longestSubArray(arr, k);
        System.out.println(longest);
    }

    private static int longestSubArray(int[] arr, int k) {
        int sum = 0, len = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                len = Math.max(i + 1, len);
            }
            int rem = sum - k;
            if (hash.containsKey(rem)) {
                len = Math.max(i - hash.get(rem), len);
            }
            if (!hash.containsKey(sum)) {
                hash.put(sum, i);
            }
        }
        return len;
    }

    private static int longestSubArrayBrute(int[] arr, int k) {
        int len = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k && len < (j - i + 1)) {
                    len = j - i + 1;
                }
            }

        }
        return len;
    }
}
