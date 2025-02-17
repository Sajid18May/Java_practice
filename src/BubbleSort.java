import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,8,3,55,23,67,29,44};

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
                }
            }
        }
        System.out.println("Sorted arr:"+ Arrays.toString(arr));
    }
}
