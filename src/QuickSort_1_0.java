public class QuickSort_1_0 {
    public static void main(String[] args) {
        int[] arr={45,65,23,22,54,66};
        quickSort(arr,0,arr.length-1);
        for (int i:arr) System.out.println(i);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high)return;

        int pivot=position(arr,low,high);

        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    private static int position(int[] arr, int low, int high) {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
            }
        }
        i++;
        arr[i]=arr[i]+arr[high]-(arr[high]=arr[i]);
        return i;
    }

}
