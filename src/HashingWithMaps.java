import java.util.HashMap;

public class HashingWithMaps {
    public static void main(String[] args) {
        int[] arr = {2,3, 2, 5, 7,5, 6, 6, 7, 8, 8, 9, 9};
        HashMap<Integer,Integer> hm= occurrence(arr);
        System.out.println(hm);
    }

    private static HashMap<Integer, Integer> occurrence(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        return hm;
    }

}
