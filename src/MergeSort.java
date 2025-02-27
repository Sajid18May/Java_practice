public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 32, 34, 56, 76, 38, 9, 18 };
        mergeSort(arr,0,arr.length-1);
        for (int j : arr) System.out.print(j+" ");
    }

    private static void mergeSort(int[] arr,int low,int high) {

        if(low>=high)return;

        int mid=low+(high-low)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr,int low,int mid,int high) {
        int l=low,r=mid+1,i=0;
        int[] temp=new int[high-low+1];
        while (l<=mid && r<=high){
            if(arr[l]<arr[r]){
                temp[i]=arr[l];
                i++;
                l++;
            }
            else {
                temp[i]=arr[r];
                i++;
                r++;
            }

        }
        while (l<=mid) {
            temp[i] = arr[l];
            i++;
            l++;
        }
        while (r<=high) {
            temp[i] = arr[r];
            i++;
            r++;
        }
        for (int index=0;index< temp.length;index++){
            arr[low+index]=temp[index];
        }
    }
}
