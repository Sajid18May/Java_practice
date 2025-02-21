public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 32, 34, 56, 76, 38, 9, 18 };
        mergeSort(arr);
        for (int j : arr) System.out.print(j+" ");
    }

    private static void mergeSort(int[] arr) {

        if(arr.length<=1)return;

        int mid=arr.length/2;
        int[] leftArray=new int[mid];
        int[] rightArray=new int[arr.length-mid];
        for (int i = 0,j=0; i < arr.length; i++) {
            if(i<mid){
                leftArray[i]=arr[i];
            }
            else{
                rightArray[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,arr);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int l=0,r=0,i=0;
        while (l<leftArray.length && r<rightArray.length){
            if(leftArray[l]<rightArray[r]){
                arr[i]=leftArray[l];
                i++;
                l++;
            }
            else {
                arr[i]=rightArray[r];
                i++;
                r++;
            }

        }
        while (l<leftArray.length) {
            arr[i] = leftArray[l];
            i++;
            l++;
        }
        while (r<rightArray.length) {
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
