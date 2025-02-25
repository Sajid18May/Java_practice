import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr = {25, 66, 31};
        selectionSortRe(arr);
        System.out.println("Sorted Array :" + Arrays.toString(arr));
    }

    private static void selectionSortRe(int[] arr) {
        selectionSortReHelper(arr, 0, 0, 0);
    }

    private static void selectionSortReHelper(int[] arr, int r, int c, int min) {
        if (r == arr.length - 1) {
            return;
        }
        if (c < arr.length) {
            if (arr[c] < arr[min]) {
                selectionSortReHelper(arr, r, c + 1, c);
            } else {
                selectionSortReHelper(arr, r, c + 1, min);
            }
        } else {
            arr[r] = arr[r] + arr[min] - (arr[min] = arr[r]);
            selectionSortReHelper(arr, r + 1, r+2, r+1);
        }
    }
}
