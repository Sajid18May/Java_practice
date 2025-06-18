import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {

        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        List<Character> al = new ArrayList<>(hash.keySet());
        Collections.sort(al, (a, b) -> hash.get(b) - hash.get(a));
        StringBuilder sb = new StringBuilder();
        for (Character ch : al) {
            for (int i = 0; i < hash.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
