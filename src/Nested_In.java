interface A1 {
	void display();

	interface A2 {
		void print();
	}
}

class B1 implements A1 {
	public void display() {
		System.out.println("Display");
	}
}

class B2 implements A1.A2 {
	public void print() {
		System.out.println("Print");
	}
}

public class Nested_In {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.display();
		B2 b2 = new B2();
		b2.print();

	}

}
