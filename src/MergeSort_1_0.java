public class MergeSort_1_0 {
    public static void main(String[] args) {
        int[] arr={45,65,23,22,54,66};
        mergeSort(arr);
        for (int i:arr) System.out.print(i+" ");
    }

    private static void mergeSort(int[] arr) {
        if(arr.length==1)return;
        int length=arr.length;
        int[] leftArray=new int[length/2];
        int[] rightArray=new int[length-length/2];
        for(int i=0,j=0;i<length;i++){

            if(i<length/2){
                leftArray[i]=arr[i];
            }
            else {
                rightArray[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr,leftArray,rightArray);

    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i=0,l=0,r=0;
        while(l<leftArray.length && r<rightArray.length){
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
        while (l<leftArray.length){
            arr[i]=leftArray[l];
            i++;
            l++;
        }
        while (r<rightArray.length){
            arr[i]=rightArray[r];
            i++;
            r++;
        }

    }


}
