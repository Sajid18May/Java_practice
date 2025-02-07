public class Day5 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,11};
        int key=9;
        int index=-1;
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            else if(arr[mid]<key){
                left=mid+1;
            }
            else
                right=mid-1;
        }
        if(index!=-1)
            System.out.println("Value is found at index: "+index);
        else
            System.out.println("Value is not found in array");
    }
}
