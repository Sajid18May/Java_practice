import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		double c;
		System.out.println("**************************");
		System.out.println("Enter A for Addition");
		System.out.println("Enter S for Substraction");
		System.out.println("Enter M for Multiplication");
		System.out.println("Enter D for Division");
		System.out.println("**************************");
		char C = sc.next().charAt(0);
		switch (C) {
		case 'A':
			c = a + b;
			System.out.println(c);
			break;
		case 'S':
			c = a - b;
			System.out.println(c);
			break;
		case 'M':
			c = a * b;
			System.out.println(c);
			break;
		case 'D':
			c = (double)a / b;
			System.out.println(c);
			break;

		default:
			System.out.println("Wrong imput");
			break;
		}
		sc.close();
	}

}
