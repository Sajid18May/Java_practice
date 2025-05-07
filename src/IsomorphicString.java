import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s="egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> hs=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                if(hs.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }else{
                if(hs.containsValue(t.charAt(i)))
                    return false;
                hs.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
