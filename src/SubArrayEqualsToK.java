import java.util.HashMap;

public class SubArrayEqualsToK {
    public static void main(String[] args) {
        int[] array = {-1,-1,1};
        int k = 0;
        System.out.println(numOfSubArrayOp(array, k));
    }
    private static int numOfSubArrayOp(int[] nums, int k) {
        int numsOfSubArray=0,sum=0;
        if(nums.length==1){
            if(k==nums[0])
                return 1;
            return numsOfSubArray;
        }
        HashMap <Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            int rem=sum-k;
            if(hash.containsKey(rem)){
                numsOfSubArray+=hash.get(rem);
            }

            if(!hash.containsKey(sum)){
                hash.put(sum,1);
            }else{
                hash.put(sum,hash.get(sum)+1);
            }
        }
        return numsOfSubArray;
    }

    private static int numOfSubArray(int[] arr, int k) {
        int numOfSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    numOfSubArrays++;
                }
            }
        }
        return numOfSubArrays;
    }
}
