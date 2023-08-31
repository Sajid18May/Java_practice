import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Reversed array will be");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
