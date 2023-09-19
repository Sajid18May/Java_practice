import java.util.ArrayList;

public class Elements_M {

	public static void main(String[] args) {
	ArrayList<Integer> El =new ArrayList<Integer>();
	El.add(56);
	El.add(34);
	El.add(66);

	for(Integer a:El) {
		System.out.println(a);
	}
	System.out.println("******");
	El.set(0,76);
	for(Integer a:El) {
		System.out.println(a);
	}
	}

}
