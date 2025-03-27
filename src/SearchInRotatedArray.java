public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        System.out.println(result(arr, 0));
    }

    private static int result(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (target < arr[mid] && target >= arr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    private static int result2(int[] nums, int target){
    int left = 0, right = nums.length - 1;

        while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // Check if left half is sorted
        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid]) {  // Target is in left half
                right = mid - 1;
            } else {  // Target is in right half
                left = mid + 1;
            }
        }
        // Otherwise, right half must be sorted
        else {
            if (nums[mid] < target && target <= nums[right]) {  // Target is in right half
                left = mid + 1;
            } else {  // Target is in left half
                right = mid - 1;
            }
        }
    }

        return -1; // Target not found
}
}
