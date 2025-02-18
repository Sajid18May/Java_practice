public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,5,8,23,56,34,97,74};
        quickSort(arr,0, arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)return;
        int pivot=position(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    private static int position(int[] arr, int low, int high) {
        int i=low-1;
        int pivot =arr[high];
        for (int j = low; j <high ; j++) {
            if(arr[j]< pivot){
                i++;
                arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
            }
        }
        i++;
        arr[high]=arr[i]+arr[high]-(arr[i]=arr[high]);
        return i;
    }


}
