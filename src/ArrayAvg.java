import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		double avg = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " of 5 Elements ");
			a[i] = sc.nextInt();
			avg += a[i];
		}
		System.out.println("Sum of the Elements in the array is " + avg);
		avg /= 5;
		System.out.println("Average of the Elements in the array is " + avg);
		sc.close();
	}

}
