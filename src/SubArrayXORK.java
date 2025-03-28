import java.util.HashMap;

public class SubArrayXORK {
    public static void main(String[] args) {
       int[] arr= {
            1 ,2 ,3, 2
        };
        System.out.println(subarraysWithSumK(arr,2));
    }
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int xor=0,numsOfB=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);

        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
            if(xor==b){
                hash.put(xor,1);
                numsOfB=Math.max(hash.get(xor),1);
            }

            int reXor=b^xor;// xor=4 b=6 //rexor=2
            if(hash.containsKey(reXor)){
                hash.put(xor,hash.get(reXor)+1);
                numsOfB+=hash.get(xor);
            }
            else{
                hash.put(xor,1);
            }
        }
        return numsOfB;
    }
}
