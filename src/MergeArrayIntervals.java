import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrayIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = mergeIntervals(intervals);
        for (int[] a : res) {
            System.out.println(Arrays.toString(a));

        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        int n = intervals.length;
        int[][] arr = new int[n][2];
        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] == null) {
                arr[j] = intervals[i];
            } else if (arr[j][1] > intervals[i][0]) {
                arr[j][0] = intervals[i][1];
            } else {
                arr[j] = arr[i];
                j++;
            }
        }
        return arr;
    }
}
