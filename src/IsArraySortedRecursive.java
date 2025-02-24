public class IsArraySortedRecursive {
    public static void main(String[] args) {
        int[] arr={3,5,22,33,44,55,66};
        System.out.println("Array is "+(isSorted(arr)?"Sorted":"Not Sorted"));
    }

    private static Boolean isSorted(int[] arr) {
        if(arr.length==1) {
            return true;
        }
        return sortChecker(arr,0);
    }

    private static Boolean sortChecker(int[] arr, int i) {
        if(i== arr.length-2) {
            return arr[i]<arr[i+1];
        }
        return arr[i]<arr[i+1] && sortChecker(arr,i+1);
    }
}
