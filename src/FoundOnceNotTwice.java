import java.util.ArrayList;

public class FoundOnceNotTwice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 5, 6, 6, 7, 8, 8, 9, 9};
        int b = onceNotTwice(arr);
        System.out.print(b);
    }

    private static int onceNotTwice(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
