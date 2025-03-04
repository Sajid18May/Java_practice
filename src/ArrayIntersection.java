import java.util.ArrayList;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 8, 8};
        int[] b = {2, 5, 6, 7, 8, 8, 9};
        ArrayList<Integer> union = arrIntersection(a, b);
        for (int i : union) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> arrIntersection(int[] a, int[] b) {
        ArrayList<Integer> is = new ArrayList<>();
        int l = 0, r = 0;
        while (l < a.length && r < b.length) {
            if (a[l] == a[r]) {
               // if (is.isEmpty() || a[l] != is.get(is.size() - 1)) {
                    is.add(a[l]);
                //}
                l++;
                r++;
            } else {
                l++;
            }
        }
        return is;
    }
}
