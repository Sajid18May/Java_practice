public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 8, 1, 2, 3};
        int key=1;
        System.out.println("Key found at index:"+roBinarySearchRe(arr,key,0,arr.length-1));
    }

    private static int roBinarySearchRe(int[] arr, int key, int l, int r) {
        int mid=l+(r-l)/2;

        if(key==arr[mid]){
            return mid;
        }
        if(arr[r]<=arr[mid]){
            if(key<arr[mid] && key>arr[l]){
                return roBinarySearchRe(arr,key,l,mid-1);
            }
            return roBinarySearchRe(arr,key,mid+1,r);
        }
        if(key>arr[mid] && key<arr[r]){
            return roBinarySearchRe(arr,key,mid+1,r);
        }
        return roBinarySearchRe(arr,key,l,mid-1);

    }
}
