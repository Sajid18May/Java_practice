class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr2 = {8, 23, 7, 2, 4, 3};
        mergeSort(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int[] leftArray = new int[arr.length / 2];
        int[] rightArray = new int[arr.length - leftArray.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i < leftArray.length) {
                leftArray[i] = arr[i];
            } else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int i = 0, l = 0, r = 0;
        while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                arr[i] = leftArray[l];
                i++;
                l++;
            } else {
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftArray.length) {
            arr[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightArray.length) {
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int pivot = position(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);

    }

    private static int position(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
            }
        }
        i++;
        arr[i] = arr[i] + arr[high] - (arr[high] = arr[i]);
        return i;
    }
}