public class CountInversions {
    public static void main(String[] args) {
//        Given an array of integers arr[]. Find the Inversion Count in the array.
//        Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(numsOfInversion(arr));
    }

    private static int numsOfInversion(int[] arr) {
        int cnt= mergeSortNI(arr,0,arr.length-1);
        return cnt;
    }

    private static int mergeSortNI(int[] arr, int low, int high) {
        int cnt=0;
        if (low>=high) return cnt;
        int mid=low+(high-low)/2;
        cnt+= mergeSortNI(arr,low,mid);
        cnt+= mergeSortNI(arr,mid+1, high);
        cnt+=mergeNI(arr,low,mid,high);
        return cnt;
    }

    private static int mergeNI(int[] arr, int low, int mid, int high) {
        int cnt=0;
        int[] temp=new int[high-low+1];
        int i=0,l=low,r=mid+1;
        while (l<=mid && r<=high){
            if(arr[l]<arr[r]){
                temp[i++]=arr[l++];
            }else {
                temp[i++]=arr[r++];
                cnt+=(mid-l+1);
            }
        }
        while (l<=mid){
            temp[i++]=arr[l++];
        }
        while (r<=high){
            temp[i++]=arr[r++];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[j+low]=temp[j];
        }
        return cnt;
    }
}
