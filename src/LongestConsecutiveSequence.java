import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={1,2,101,102,100,3,4,103,105,104,3,5,4,4,6,1,0};
        System.out.println(findLongest(arr));

    }

    private static int findLongest(int[] arr) {
        int maxLength=1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i:hs){
            if(!hs.contains(i-1)){
               int count=1;
               int x=i;
               while (hs.contains(x+1)){
                   x++;
                   count++;
               }
               maxLength=Math.max(count,maxLength);
            }
        }
        return maxLength;
    }
}
