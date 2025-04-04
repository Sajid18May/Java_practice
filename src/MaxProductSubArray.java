public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums={-2,0,-2,3,4,0,5,6,0};//{2,3,0,-2,4};
        System.out.println(maxProductSubArray(nums));
    }

    private static int maxProductSubArray(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        int prefix=1;
        int postfix=1;
        for (int i = 0; i < nums.length; i++) {
            if(prefix==0) prefix=1;
            if(postfix==0) postfix=1;
            prefix*=nums[i];
            postfix*=nums[nums.length-1-i];
            maxProduct=Math.max(maxProduct,Math.max(prefix,postfix));
        }
        return maxProduct;
    }
}
