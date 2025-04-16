class Bouquets {
    public static void main(String[] args) {

    }
    private static int bouquets(int[] arr,int bt,int k){
        int count=0;
        int nums=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=bt){
                count++;
            }else{
                nums+=(count/k);
                count=0;
            }
        }
        nums+=(count/k);
        return nums;
    }
    public static int minDays(int[] arr, int m, int k) {
        if((long)m*k > arr.length) return -1;
        int max=arr[0];
        int min=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int ans=-1;
        int low=min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(bouquets(arr,mid,k)>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}