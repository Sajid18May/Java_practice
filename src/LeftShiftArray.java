public class LeftShiftArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 2, 4, 1, 5};
        //2, 4, 1, 5,4, 5, 6, 8
        int d = 4;
        leftShift(arr, d);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void leftShift(int[] arr, int d) {
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int s, int e) {
        int mid=s+(e-s)/2;
        for (int i = s,j=0; i <=mid ; i++) {
            arr[i]=arr[i]+arr[e-j]-(arr[e-j]=arr[i]);
            j++;
        }
    }
}
