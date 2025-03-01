import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 2, 9};
        reverseArrReV2(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArrRe(int[] arr,int start,int end) {
        if(start>end)return;
        arr[start]=arr[start]+arr[end]-(arr[end]=arr[start]);
        reverseArrRe(arr,start+1,end-1);
    }

    private static void reverseArrReV2(int[] arr,int idx) {
        if(idx> arr.length/2)return;
        arr[idx]=arr[idx]+arr[arr.length-1-idx]-(arr[arr.length-1-idx]=arr[idx]);
        reverseArrReV2(arr,idx+1);
    }

    private static void reverseArr(int[] arr) {
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
