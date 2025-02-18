public class QuickSort_1_0 {
    public static void main(String[] args) {
        int[] arr={45,65,23,22,54,66};
        quickSort(arr,0,arr.length-1);
        for (int i:arr) System.out.println(i);
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)return;
        int pivot=position(arr,low,high);
        quickSort(arr,low,pivot-1);// 4 6 7 8 3 12 34 5 //4 3 (5) 7 8 6 12 34
        quickSort(arr,pivot+1,high);
    }
    public static int position(int []arr,int low,int high){
        int i=low-1;// 4 6 7 8 3 12 34 (5)
        int pivot=arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
            }
        }
        i++;
        arr[high]=arr[i]+arr[high]-(arr[i]=arr[high]);
        return i;
    }
}
