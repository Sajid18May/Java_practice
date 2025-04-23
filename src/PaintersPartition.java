import java.util.ArrayList;
import java.util.Arrays;

public class PaintersPartition {
    public static void main(String[] args) {
        ArrayList<Integer> ls= new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        System.out.println(findLargestMinDistance(ls,2));
    }
    private static boolean validDistance(ArrayList<Integer>boards,int k,int dis){
        int totalLength=0;
        int numOfBoard=1;
        for(Integer i:boards){
            if(totalLength+i > dis){
                numOfBoard++;
                totalLength=i;
            }
            else{
                totalLength+=i;
            }
        }
        return numOfBoard <= k;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        if(boards.size()<k) return -1;
        int max=0,sum=0;
        for(Integer i:boards){
            if(i>max) max=i;
            sum+=i;
        }

        int low=max,high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(validDistance(boards,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
