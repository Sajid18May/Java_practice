import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr={3,5,12,8,10,25,66,31};
        bubbleSortRe(arr);
        System.out.println("Sorted Array :"+Arrays.toString(arr));
    }

    private static void bubbleSortRe(int[] arr) {
        bubbleSortReHelper(arr,0,0);
    }

    private static void bubbleSortReHelper(int[] arr, int r, int c) {
        if(r== arr.length-1) {
            return;
        }
        if(r<arr.length){
            if(c<arr.length-1-r) {
                if(arr[c]>arr[c+1]){
                    arr[c]=arr[c]+arr[c+1]-(arr[c+1]=arr[c]);
                }
                bubbleSortReHelper(arr, r, c+1);
            }else {
                bubbleSortReHelper(arr, r+1, 0);
            }
        }
    }
}
