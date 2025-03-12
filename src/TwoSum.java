import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 6, 8, 9};
        int k = 15;
        String res = twoSum(arr,k);
        System.out.println(res);
    }

    private static String twoSum(int[] arr, int k) {
        int i = 0,j= arr.length-1,sum=0;
        while ( i < j) {
            sum=arr[i]+arr[j];
            if(sum==k){
                return "YES";
            } else if (sum>k) {
                j--;
            }else{
                i++;
            }
        }
        return "NO";
    }

    private static String twoSum1(int[] arr, int k) {
        HashMap <Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int rem=k-arr[i];
            if(hash.containsKey(rem)){
                return "YES";
            }
            else{
                hash.put(arr[i],i);
            }
        }
        return "NO";
    }
}
