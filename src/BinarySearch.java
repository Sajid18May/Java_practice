public class BinarySearch {
    //Only applicable on Sorted array
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,61,99,125,356,654,789,888};
        int left=0;
        int right=arr.length-1;
        int key=61;
        int index=-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            else if(arr[mid]<key){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        if (index!=-1)
            System.out.println("Value found at:"+index);
        else
            System.out.println("Value not found");
    }
}
