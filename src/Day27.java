public class Day27 {
    public static void main(String[] args) {
        int[] arr={3,6,2,9,1,5,4,45,12,48};
        mergeSortTry1(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    private static void mergeSortTry1(int[] arr, int l, int r) {
        if(l==r) return;
        int mid=l+(r-l)/2;
        mergeSortTry1(arr,l,mid);
        mergeSortTry1(arr,mid+1,r);
        mergeTry1(arr,l,r);
    }

    private static void mergeTry1(int[] arr, int l, int r) {
        int mid=l+(r-l)/2;
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while (j<=r){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for (int x=0;x< temp.length;x++){
            arr[x+l]=temp[x];
        }
    }
}
