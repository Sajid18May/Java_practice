interface Az {
	void disp();
}
interface Bz {
	void print();
}
class Abc implements Az,Bz {
	public void disp() {
		System.out.println("Display");
	}
	public void print() {
		System.out.println("Print");
	}
}

public class Interface {

	public static void main(String[] args) {
		Abc a1 = new Abc();
		a1.disp();
		a1.print();
	}

}
