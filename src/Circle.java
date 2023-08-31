import java.util.Scanner;

public class Circle {
	static double pi = Math.PI;

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = sc.nextInt();
		System.out.println("Circumference of circle is = " + 2 * pi * r);
		System.out.println("Area of circle is = " + pi * r * r);
		sc.close();
	}
}
