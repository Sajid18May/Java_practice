import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
    int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        List <List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1,k=arr.length-1;
            while(j<k){
                int sum=arr[i];
                sum+=arr[j];
                sum+=arr[k];
                if(sum==0){
                    List<Integer> vals=new ArrayList<>();
                    vals.add(arr[i]);
                    vals.add(arr[j]);
                    vals.add(arr[k]);
                    ans.add(vals);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k+1]==arr[k]) k--;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}
