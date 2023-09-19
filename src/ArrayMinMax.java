import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " of 5 Elements ");
			a[i] = sc.nextInt();
		}
		int Min = a[0];
		int Max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (Max < a[i]) {
				Max = a[i];
			}
			if (Min > a[i]) {
				Min = a[i];
			}
		}

		System.out.println("Minimum number is  " + Min);
		System.out.println("Maximum number is  " + Max);
		sc.close();
	}

}
