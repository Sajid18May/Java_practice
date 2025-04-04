public class ReversePairs {
    public static void main(String[] args) {
//        A reverse pair is a pair (i, j) where:
//        0 <= i < j < nums.length and
//        nums[i] > 2 * nums[j].
       int[] nums = {1,3,2,3,1};
        System.out.println(numsOfPair(nums));
    }

    private static int numsOfPair(int[] nums) {
        int cnt=mergeSortrp(nums,0,nums.length-1);
        return cnt;
    }

    private static int mergeSortrp(int[] arr, int low, int high) {
        int cnt=0;
        if(low>=high) return cnt;
        int mid=low+(high-low)/2;
        cnt+=mergeSortrp(arr, low, mid);
        cnt+=mergeSortrp(arr, mid+1, high);
        cnt+=countPair(arr,low,mid,high);
        mergerp(arr,low,mid,high);
        return cnt;
    }

    private static int countPair(int[] arr, int low, int mid, int high) {
        int cnt=0,r=mid+1;
        for (int i = low; i < mid+1; i++) {
            while (r<=high && arr[i]>2*arr[r]){
                cnt+=(mid-i+1);
                r++;
            }
        }
        return cnt;
    }

    private static void mergerp(int[] arr, int low, int mid, int high) {
        int i=0,l=low,r=mid+1;
        int[] temp=new int[high-low+1];
        while (l<=mid && r<=high){
            if(arr[l]<=arr[r]){
                temp[i++]=arr[l++];
            }else{
                temp[i++]=arr[r++];
            }
        }
        while (l<=mid){
            temp[i++]=arr[l++];
        }
        while (r<=high){
            temp[i++]=arr[r++];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[low+j]=temp[j];
        }
    }
}
