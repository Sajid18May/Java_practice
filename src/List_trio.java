import java.util.ArrayList;

public class List_trio {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		l1.add(11);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(13);
		l2.add(17);
		l2.add(19);
		l2.add(23);
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.addAll(l2);
		for(Integer a:l3) {
			System.out.println(a);
		}
		System.out.println(l3);
		System.out.println(l3.get(l3.size()/2));
		System.out.println("*****");
		for(int c=l3.size()/2;c<l3.size();c++) {
			System.out.println(l3.get(c));
		}
		
	}
}
