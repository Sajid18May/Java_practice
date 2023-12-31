class Ref {
	void add() {
		int a = 6, b = 7, c = a + b;
		System.out.println("Addition is = " + c);
	}

	static void sub() {
		int a = 6, b = 7, c = a - b;
		System.out.println("Sustraction is = " + c);
	}
}

public class Method_Ref {

	public static void main(String[] args) {
		Thread t1 = new Thread(Ref::sub);
		t1.start();
		Thread t2 = new Thread(new Ref()::add);
		t2.start();
	}

}
