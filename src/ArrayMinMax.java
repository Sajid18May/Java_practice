import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		/*
		 * for (int i = 0; i < a.length; i++) { a[i] = sc.nextInt(); }
		 */
		for (int i : a) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int Min = a[0];
		int Max = a[a.length - 1];
		System.out.println("Minimum number is  " + Min);
		System.out.println("Maximum number is  " +Max);
		sc.close();
	}

}
