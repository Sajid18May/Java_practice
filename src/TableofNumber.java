import java.util.Scanner;

public class TableofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int i = 1;
		int r = 1;
		do {
			r = n * i;
			System.out.println(n + "*" + i + "=" + r);
			i++;
		} while (i<=10);
		sc.close();
	}
}
