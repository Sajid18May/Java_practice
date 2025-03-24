import java.util.ArrayList;

public class InsertArray {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,1};
        int n=3,el=54;
        System.out.println(insertArray(arr,n,el));
    }

    private static ArrayList<Integer> insertArray(int[] arr, int n, int el) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i:arr){
            ls.add(i);
        }
        ls.add(n,el);
        return ls;
    }
}
