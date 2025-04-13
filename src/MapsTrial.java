import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsTrial {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();
        TreeMap<String,Integer> tm=new TreeMap<>();
        hm.put("Mike",20000);
        hm.put("Sam",450000);
        hm.put("Jack",34000);
        lm.put("Mike",20000);
        lm.put("Sam",450000);
        lm.put("Jack",34000);
        tm.put("Mike",20000);
        tm.put("Sam",450000);
        tm.put("Jack",34000);
        System.out.println(hm);
        System.out.println(lm);
        System.out.println(tm);
    }
}
