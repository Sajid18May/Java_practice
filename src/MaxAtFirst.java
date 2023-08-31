import java.util.Scanner;

public class MaxAtFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int max = 0, temp = 0;
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] > max) {
				max = a[i];
				temp = i;
			}
		}
		a[temp] = a[0];
		a[0] = max;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
