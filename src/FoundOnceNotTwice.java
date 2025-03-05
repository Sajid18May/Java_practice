import java.util.ArrayList;

public class FoundOnceNotTwice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 5, 6, 6, 7, 8, 8, 9, 9};
        int b = onceNotTwice(arr);
        System.out.print(b);
    }

    private static int onceNotTwice(int[] arr) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i:arr){
            if(ls.isEmpty()){
                ls.add(i);
            } else if (ls.get(ls.size()-1)!=i) {
                ls.add(i);
            }
            else {
                ls.remove(ls.size()-1);
            }
        }
     return ls.get(ls.size()-1);
    }

    private static int onceNotTwiceBrute(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] hash = new int[max + 1];
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    hash[i] += 1;
                }
            }
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1)
                return i;
        }
        return max;
    }
}
