public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 4, 9, 12, 46, 7};
        insertionSortRe(arr, 1);
        for (int i : arr) System.out.print(i + " ");
    }

    private static void insertionSortRe(int[] arr, int i) {
        if (i == arr.length - 1) {
            return;
        }
        insertionSortReHelper(arr, i - 1, arr[i]);

        insertionSortRe(arr, i + 1);

    }

    private static void insertionSortReHelper(int[] arr, int j, int temp) {
        if (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            insertionSortReHelper(arr, j - 1, temp);
        } else {
            arr[j + 1] = temp;
        }
    }
}
