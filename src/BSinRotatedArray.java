public class BSinRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }

    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] <= arr[high]) {
                if(arr[mid]<= target && arr[high]>=target){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }else {
                if (arr[low] <= target && arr[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return index;
    }
}
