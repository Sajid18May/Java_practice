public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));

    }
    public static int searchInsert(int[] nums, int target) {
        int index=nums.length;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }
}
