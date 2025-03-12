import java.util.Arrays;

public class Sorting012s {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,2,2,1,1,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] arr) {
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                arr[low]=arr[low]+arr[mid]-(arr[mid]=arr[low]);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                arr[high]=arr[high]+arr[mid]-(arr[mid]=arr[high]);
                high--;
            }
        }
    }
}
