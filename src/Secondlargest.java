public class Secondlargest {
    public static void main(String[] args) {
        int [] arr={1,2,34,66,3,4,44,5,6,7,17};
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i])
                largest=arr[i];
            if(secondLargest<arr[i]&&arr[i]!=largest)
                secondLargest=arr[i];
        }
        System.out.println("Largest Value= "+largest);
        System.out.println("Second Largest Value= "+secondLargest);

    }
}
