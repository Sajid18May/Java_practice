public class MergeArraysOp {
    public static void main(String[] args) {
        int[] nums1={0,0,0};
        int m=0;
        int[] nums2={2,5,6};
        int n=3;
        mergeOP(nums1,m,nums2,n);
        for(int i:nums1){
            System.out.println(i);
        }
    }

    private static void mergeOP(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int i=m+n-1,l=m-1,r=n-1;
        while(l>=0 && r>=0){
            if(nums1[l]>nums2[r]){
                nums1[i]=nums1[l];
                l--;
            }else {
                nums1[i]=nums2[r];
                r--;
            }
            i--;
        }
        while(r>=0){
            nums1[i]=nums2[r];
            r--;
            i--;
        }
    }
}
