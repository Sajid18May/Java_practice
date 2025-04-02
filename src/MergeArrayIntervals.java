
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
        List<int[]> ls=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[]arr = intervals[0];
        for (int i = 0; i < n; i++) {
             if (arr[1] >= intervals[i][0]) {
                arr[1] = Math.max(intervals[i][1],arr[1]);
            } else {
                ls.add(arr);
                arr=intervals[i];
            }
        }
        ls.add(arr);
        return ls.toArray(new int[ls.size()][]);
    }
}
