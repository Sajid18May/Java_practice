
public class OverRiding {

	public static void main(String[] args) {
		Operator o1 = new Operator();
		o1.res();
		System.out.println("Division "+o1.res(8,4));
		System.out.println("Addision " + o1.res(1, 2, 3, 4, 5));
		Addision a = new Addision();
		System.out.println("Addision is " + a.res(1, 2, 3, 4, 5));
		Division d = new Division();
		System.out.println("Division is " + d.res(7, 2));
		Sustraction s = new Sustraction();
		System.out.println("Sustraction is " + s.res(98, 6, 2));
		Multiplication m = new Multiplication();
		m.res(3, 4, 5, 6);

	}

}

class Operator {
	void res() {
		System.out.println("Artithmetic operator");
	}
	int res(int a, int b, int c, int d, int e) {
		int r = a + b + c + d + e;
		return r;
	}
	int res(int a, int b) {
		int r = a / b;
		return r;
	}
	int res(int a, int b, int c) {
		int r = a - b - c;
		return r;
	}
}

class Addision extends Operator {

	int res(int a, int b, int c, int d, int e) {
		int r = a + b + c + d + e;
		return r;
	}
}

class Division extends Operator {

	int res(int a, int b) {
		int r = a / b;
		return r;
	}
}

class Sustraction extends Operator {
	int res(int a, int b, int c) {
		int r = a - b - c;
		return r;
	}
}

class Multiplication extends Operator {

	void res(int a, int b, int c, int d) {
		System.out.println("Multiplication is " + (a * b * c * d));
	}
}