
public class Grades {

	public static void main(String[] args) {
		int sub1 = 45;
		int sub2 = 30;
		int sub3 = 10;
		
		double total = sub1 + sub2 + sub3;
		System.out.println("Total is " + total);

		double p = total / 150 * 100;
		System.out.println("Percentage is " + p);

		if (p >= 90) {
			System.out.println("Grade A");
		} else if (p >= 80) {
			System.out.println("Grade B");
		} else if (p >= 70) {
			System.out.println("Grade C");
		} else if (p >= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}
	}

}
