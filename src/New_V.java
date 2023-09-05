
public class New_V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.drive();
	}

}

class Vehical {
	void drive() {
		System.out.println("In vehical");
	}
}

class Car extends Vehical {
	void drive() {
		System.out.println("Repairing a car");
	}
}