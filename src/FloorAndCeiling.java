import java.util.Arrays;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int n=6,x=8;
        int[] arr={3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(getFloorAndCeil(arr,n,x)));
    }
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int floor=-1,ceiling=-1;
        int low=0,high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ceiling=arr[mid];
                high=mid-1;

            }else{
                low=mid+1;
            }
        }

        return new int[]{floor,ceiling};
    }
}
