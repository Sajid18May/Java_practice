public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,61,99,125,356,654,789,888};
        int key=99;
        int l=0;
        int r=arr.length-1;
        System.out.println("Element found at Index: "+recursiveBinarySearch(arr,key,l,r));
    }

    private static int recursiveBinarySearch(int[] arr, int key, int l, int r) {

        if(l>r) return -1;//baseclass

        int mid=(l+r)/2;

        if(key==arr[mid]) {
            return mid;
        }

        else if(key>arr[mid]) {
            return recursiveBinarySearch(arr, key, mid + 1, r);
        }

        return recursiveBinarySearch(arr, key, l, mid - 1);
    }
}
