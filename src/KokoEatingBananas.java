public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr={30,11,23,4,20};
        int h=6;
        System.out.println(minEatingSpeed(arr,h));
    }
    private static int time(int[] arr, int v) {
        int total = 0;
        for (int i : arr) {
            total += Math.ceil((double) i / v);
        }
        return total;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int  minEatingSpeed(int[] piles, int h) {
        int ans = Integer.MAX_VALUE;
        int low = 1, high = max(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (time(piles, mid) <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

