import java.util.HashMap;

public class Day18 {
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
                len = Math.max(len, i + 1);
            }
            int rem = sum - k;
            if (hash.containsKey(rem)) {
                int l = i - hash.get(rem);
                len = Math.max(l, len);
            }
            if (!hash.containsKey(sum)) {
                hash.put(sum, i);
            }
        }

        return len;
    }
}

