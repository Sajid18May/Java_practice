import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterator_demo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(34);
		set.add(65);
		set.add(45);
		set.add(55);
		set.add(95);
		
		/* for(Integer a:set) { System.out.println(a); } */
		 
		
		Iterator<Integer> v=set.iterator();
		while(v.hasNext()) {
			System.out.println(v.next());
		}
		System.out.println("****");
		Set<Integer> s=new LinkedHashSet<>();
		s.add(34);
		s.add(65);
		s.add(45);
		s.add(55);
		s.add(95);
		Iterator<Integer> v1=s.iterator();
		while(v1.hasNext()) {
			System.out.println(v1.next());
		}
	}

}
