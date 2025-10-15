import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class LargestElementArray {
    static void main() {
        int[] arr={0,6,2,9,13,7,15,8};
        System.out.println("Largest element is = " + largestElement(arr));

        System.out.println("Largest element is = " + largestElementStream(arr));
    }

    private static int largestElement(int[] arr) {
        int max=arr[0];
        for(int num:arr){
            if(num>max)
                max=num;
        }
        return max;
    }
    private static int largestElementStream(int[] arr) {

        return Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);
    }
}
