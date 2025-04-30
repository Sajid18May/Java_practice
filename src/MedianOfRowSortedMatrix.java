public class MedianOfRowSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1, 5, 7, 9, 11 },
                {2, 3, 4, 8, 9 },
                {4, 11, 14, 19, 20 },
                {6, 10, 22, 99, 100 },
                {7, 15, 17, 24, 28 }
        };
        System.out.println(findMedian(arr,5,5));
    }
    private static int upperBound(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int ocrCount(int[][] matrix, int m, int n, int k) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            count += upperBound(matrix[i], n, k);
        }
        return count;
    }

    public static int findMedian(int[][] matrix, int m, int n) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        int req = (m * n) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ocrCount(matrix, m, n, mid) <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
