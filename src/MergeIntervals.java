import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeIntervals {
    public static void main(String[] args) {
       int[][] intervals ={{1,3},{2,6},{8,10},{15,18}};
       int[][] res=merge(intervals);
       for(int[] a:res){
           System.out.println(Arrays.toString(a));
       }
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();
        for (int i = 0; i <intervals.length-1 ; i++) {
            for (int j = 0; j <intervals.length-1; j++) {
                if(intervals[i][j+1]>intervals[i+1][j]){
                    int[] arr=new int[2];
                    arr[0]=intervals[i][j];
                    arr[1]=intervals[i+1][j+1];
                    list.add(arr);
                }
            }
        }
        return list.toArray(intervals);
    }
}
