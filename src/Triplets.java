import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-1,4};
        System.out.println(triplets(arr));
    }

    private static List<List<Integer>> triplets(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(i>0 && arr[i-1]==arr[i]) continue;
            int j=i+1,k= arr.length-1;
                while (j<k){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        List <Integer> vals=new ArrayList<>();
                        vals.add(arr[i]);
                        vals.add(arr[j]);
                        vals.add(arr[k]);
                        ans.add(vals);
                        j++;
                        k--;
                        while (j<k && arr[j-1]==arr[j]) j++;
                        while (j<k && arr[k]==arr[k+1]) k--;
                    }
                    else if(sum>0){
                        k--;
                    }
                    else {
                        j++;
                    }
                }
        }
        return ans;
    }
}
