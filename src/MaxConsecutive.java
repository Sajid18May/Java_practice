import java.util.HashMap;
public class MaxConsecutive {
    public static void main(String[] args) {
        System.out.println(maxConsecutive("It's a animal"));
    }
    public static char maxConsecutive(String str) {
        int max=0;
        char maxCrop=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
                map.put(str.charAt(i),1);
        }
        for(Character c:map.keySet()) {
            if(map.get(c)>max) {
                max = map.get(c);
                maxCrop=c;
            }
        }
        return maxCrop;
    }

}
