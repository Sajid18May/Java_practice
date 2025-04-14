public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("Number of Rotation = "+rotationNumber(arr));

    }
    private static int rotationNumber(int[] arr){
        int rotation=0,min=Integer.MAX_VALUE;
        int low=0,high= arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<min){
                rotation=mid;
                min=arr[mid];
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    rotation=low;
                    min=arr[low];
                }
                low=mid+1;
            }
            else {
                if(arr[mid]<min){
                    rotation=mid;
                    min=arr[mid];
                }
                high=mid-1;
            }
        }
        return rotation;
    }
}
