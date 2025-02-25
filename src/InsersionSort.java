public class InsersionSort {
    public static void main(String[] args) {
        int[] arr={6,8,2,4,9,12,46,7};
        insertionSort(arr);
        for (int i:arr) System.out.print(i+" ");
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
}
