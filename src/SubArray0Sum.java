import java.util.HashMap;

public class SubArray0Sum {
    public static void main(String[] args) {
        int[] arr={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxSubArrayLength(arr));
    }

    private static int maxSubArrayLength(int[] arr) {
        int maxLength=0;
        HashMap <Integer,Integer> hash=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLength=Math.max(maxLength,i+1);
            }
            if(hash.containsKey(sum)){
                maxLength=Math.max(maxLength,i-hash.get(sum));
            }else{
                hash.put(sum,i);
            }
        }
        return maxLength;
    }
}
