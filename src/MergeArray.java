public class MergeArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int l = 0, r = 0, i = 0;
        while (l < m && r < n) {
            if (nums1[l] < nums2[r]) {
                arr[i] = nums1[l];
                l++;
                i++;
            } else {
                arr[i] = nums2[r];
                i++;
                r++;
            }
        }
        while (l < m) {
            arr[i] = nums1[l];
            i++;
            l++;
        }
        while (r < n) {
            arr[i] = nums2[r];
            i++;
            r++;
        }
        for(int j:arr){
            System.out.println(j);
        }
        nums1 = arr.clone();
        for(int j:nums1){
            System.out.println(j);
        }

    }
}
