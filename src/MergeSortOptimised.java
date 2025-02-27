public class MergeSortOptimised {
    public static void main(String[] args) {
        int[] arr={5,3,6,2,7,12,61,9};
        mergeSortHelper(arr,0, arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }
    private static void mergeSortHelper(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=low+(high-low)/2;

        mergeSortHelper(arr,low,mid);
        mergeSortHelper(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(int[] arr,int low,int mid,int high){
        int i=0,l=low,r=mid+1;
        int[] temp=new int[high-low+1];
        while(l<=mid && r<=high){
            if(arr[l]<arr[r]){
                temp[i]=arr[l];
                i++;
                l++;
            }
            else{
                temp[i]=arr[r];
                i++;
                r++;
            }
        }
        while(l<=mid){
            temp[i]=arr[l];
            i++;
            l++;
        }
        while(r<=high){
            temp[i]=arr[r];
            i++;
            r++;
        }
        for(int index = 0; index <temp.length; index++){
            arr[low+index]=temp[index];
        }
    }
}
