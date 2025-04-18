public class smallestDivisor {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int threshold=5;
        System.out.println("Smallest Divisor :"+smallestDivisor(arr,threshold));
    }
    public static int sumOfDev(int[] arr,int divisor){
        int sum=0;
        for(int i:arr){
            sum+= (int) Math.ceil((double) i / divisor);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i:nums){
            if(i>max)
                max=i;
        }
        int ans=1;
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumOfDev(nums,mid)<=threshold){
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
