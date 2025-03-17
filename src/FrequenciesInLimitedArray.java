import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesInLimitedArray {
    public static void main(String[] args) {
       int[] arr= {2, 3, 2, 3, 5};
        System.out.println(frequencyCount(arr));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:arr){
            if(!hash.containsKey(i)){
                hash.put(i,1);
            }
            else{
                hash.put(i,hash.get(i)+1);
            }
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            if(hash.containsKey(i)){
                ls.add(hash.get(i));
            }
            else{
                ls.add(0);
            }
        }
        return ls;
    }
}
