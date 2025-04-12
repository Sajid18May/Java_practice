import java.util.ArrayList;
import java.util.Collections;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        Collections.addAll(ls,4, 5, 6, 7, 0, 1, 2, 3);
        System.out.println("Minimum value= "+findMin(ls));
    }

    public static int findMin(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(low) <= arr.get(mid)) {
                min = Math.min(min, arr.get(low));
                low = mid + 1;
            } else {
                min = Math.min(min, arr.get(mid));
                high = mid - 1;
            }
        }
        return min;
    }

}
