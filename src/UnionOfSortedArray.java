import java.util.ArrayList;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 8};
        int[] b = {2, 5, 6, 7, 8, 8, 9};
        ArrayList<Integer> union = arrUnion(a, b);
        for (int i : union) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> arrUnion(int[] a, int[] b) {
        ArrayList<Integer> ls = new ArrayList<>();
        int l = 0, r = 0;
        while (l<a.length && r<b.length){
            if(a[l]<b[r]){
                if(ls.isEmpty() || a[l]!=ls.get(ls.size()-1)){
                    ls.add(a[l]);
                }
                l++;
            }
            else {
                if(ls.isEmpty() || b[r]!=ls.get(ls.size()-1)){
                    ls.add(b[r]);
                }
                r++;
            }
        }
        while (l<a.length){
            if(ls.isEmpty() || a[l]!=ls.get(ls.size()-1)){
                ls.add(a[l]);
            }
            l++;
        }
        while (r<b.length){
            if(ls.isEmpty() || b[r]!=ls.get(ls.size()-1)){
                ls.add(b[r]);
            }
            r++;
        }
        return ls;
    }
}
