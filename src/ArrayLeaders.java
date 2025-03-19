import java.util.ArrayList;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {228, 394, 967, 463, 227, 388, 757, 782, 238};
        System.out.println(arrayLeaders(arr));
    }

    private static ArrayList<Integer> arrayLeaders(int[] arr) {
        int lead = Integer.MIN_VALUE;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > lead) {
                lead = arr[i];
                ls.add(arr[i]);
            }
        }
        return ls;
    }
}
