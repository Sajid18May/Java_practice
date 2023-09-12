class W {
	int a = 43, b = 65;

	void add() {
		System.out.println("Addision = " + (a + b));

	}

	interface O {
		void disp();
	}
}

class P implements W.O {
	public void disp() {
		System.out.println("Inside Interface ");
	}
}

public class Interface_in_Class {

	public static void main(String[] args) {
		W w1 = new W();
		w1.add();
		P p1 = new P();
		p1.disp();

	}

}
