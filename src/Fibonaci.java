
public class Fibonaci {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21
		int num = 7;
		for (int i = 0; i < num; i++)
			System.out.println(fiboRe(i));
		System.out.println("===========");
		fiboLoop(10);

	}

	public static int fiboRe(int n) {
		if (n <= 1)
			return n;
		else
			return fiboRe(n - 1) + fiboRe(n - 2);
	}

	public static void fiboLoop(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			if (i <= 1)
				System.out.println(i);
			else {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}
}
