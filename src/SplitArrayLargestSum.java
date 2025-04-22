public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }
    public static boolean checkValid(int[] nums, int k,int mid){
        int subSum = 0;
        int subNum = 1;
        for (int i : nums) {
            if (subSum + i > mid) {
                subNum++;
                subSum = i;
            } else {
                subSum += i;
            }
        }
        return subNum <= k;
    }
    public static int splitArray(int[] nums, int k) {
        if(nums.length < k) return -1;
        int max=0,sum=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
            sum+=i;
        }
        int low=max,high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkValid(nums,k,mid)){
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
