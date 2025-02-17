import java.util.Arrays;

public class BinarySearch {
    //Only applicable on Sorted array
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,61,99,125,356,654,789,888};
        int key=99;
        int l=0;
        int r= arr.length-1;
        int index=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            } else if (key>arr[mid]) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        if (index!=-1)
            System.out.println("Value found at:"+index);
        else
            System.out.println("Value not found");
        
        //With Built-in Method
        if(Arrays.binarySearch(arr,key)!=-1){
            System.out.println("Value found at:"+index);
        }
        else {
            System.out.println("Value not found");
        }
    }
}
