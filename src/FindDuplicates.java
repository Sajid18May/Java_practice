import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={25,5,8,23,25,34,12,54};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Found Duplicate value "+arr[i]);
                }
            }
        }
        Set <Integer> noDupe=new HashSet<>();
        for (int i:
             arr) {
            if(!noDupe.add(i))
                System.out.println("Found Duplicate "+i);
        }
    }
}
