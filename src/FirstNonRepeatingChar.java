import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="swiss";
        System.out.println(findFirstNonRepeatingChar(s));
    }
    private static int findFirstNonRepeatingChar(String s){
        int index=-1;
        HashMap<Character,Integer> hash=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),1);
            }else {
                int val=hash.get(s.charAt(i));
                hash.put(s.charAt(i),++val);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(hash.get(s.charAt(i))==1){
                return i;
            }
        }
        return index;
    }
}
