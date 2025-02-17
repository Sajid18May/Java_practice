import java.util.ArrayList;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] arr={2,5,8,23,56,34,97,74};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int i:arr) {
            if(i%2==0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        System.out.println("Even :"+even);
        System.out.println("Odd :"+odd);
    }
}
