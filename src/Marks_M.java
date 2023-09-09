abstract class Marks {
	abstract void Percentage();
}

class SuA extends Marks {
	int s1, s2, s3, s4, R;

	SuA(int a, int b, int c, int d) {
		s1 = a;
		s2 = b;
		s3 = c;
		s4 = d;
	}

	void Percentage() {
		R = (s1 + s2 + s3 + s4) / 4;
		System.out.println("Percentage is " + R);
	}
}

class SuB extends Marks {
	int s1, s2, s3, R;

	SuB(int a, int b, int c) {
		s1 = a;
		s2 = b;
		s3 = c;
	}

	void Percentage() {
		R = (s1 + s2 + s3) / 3;
		System.out.println("Percentage is " + R);
	}
}

public class Marks_M {
	public static void main(String[] args) {

		Marks m1 = new SuA(64, 72, 94, 75);
		m1.Percentage();
		Marks m2 = new SuB(84, 62, 95);
		m2.Percentage();
	}

}
