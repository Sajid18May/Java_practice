import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i-1]==arr[i])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j-1]==arr[j])continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    int sum=arr[i];
                    sum+=arr[j];
                    sum+=arr[k];
                    sum+=arr[l];
                    if(sum==target){
                        List<Integer> vals=new ArrayList<>();
                        vals.add(arr[i]);
                        vals.add(arr[j]);
                        vals.add(arr[k]);
                        vals.add(arr[l]);
                        k++;
                        l--;
                        ans.add(vals);
                        while(k<l && arr[k-1]==arr[k]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }

        }
        return ans;
    }
}
