import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int k=4;
        int[] arr={0, 3, 4, 7, 10, 9};
        System.out.println(aggressiveCows(arr,k));
    }
    public static int aggressiveCows(int []stalls, int k){
        Arrays.sort(stalls);
        int low=1,high=stalls[stalls.length-1]-stalls[0];
        int res=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(stalls,mid,k)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

    private static boolean isPossible(int[] stalls, int mid, int k) {
        int last=stalls[0];
        int count=1;
        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i]-last >= mid){
                count++;
                last=stalls[i];
            }

        }
        if(count >= k){
            return true;
        }
        return false;
    }
}
