import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int a = sc.nextInt();

		System.out.println("Enter second number");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " Is Greater than " + b);
		} 
		else {
			System.out.println(b + " Is Greater than " + a);
		}
		sc.close();
	}

}
