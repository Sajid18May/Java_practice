import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,5,12,8,10,25,66,31};
        selectionSort(arr);
        System.out.println("Sorted Array :"+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            arr[i]=arr[min]+arr[i]-(arr[min]=arr[i]);
        }
    }
}
