import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(115, "Brown");
		map2.put(120, "Purple");

		map.putAll(map2);

//Elements can traverse in any order

		for (Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println("******");
		for (Entry<Integer, String> m1 : map2.entrySet()) {

			System.out.println(m1.getKey() + " " + m1.getValue());

		}
		System.out.println(" "+map.containsKey(71)); 
		System.out.println(" "+map.containsValue("Brown"));
	}
}