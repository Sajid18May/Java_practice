abstract class Parent {
	abstract void message();
}

class sub1 extends Parent {
	void message() {
		System.out.println("This is the First sub class");
	}
}

class sub2 extends Parent {
	void message() {
		System.out.println("This is the Second sub class");
	}
}

public class Abstruct {

	public static void main(String[] args) {
		Parent p1 = new sub1();
		Parent p2 = new sub2();
		p1.message();
		p2.message();
	}

}
