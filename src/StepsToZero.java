
public class StepsToZero {
	public static void main(String[] args) {
		int n = 56344;
		System.out.println(stepsToZero(n));
	}

	private static int stepsToZero(int n) {
		if (n == 0)
			return 0;
		return steps(n, 0);
	}

	private static int steps(int n, int step) {
		if (n == 0) {
			return step;
		}
		if (n % 2 == 0) {
			return steps(n / 2, step + 1);
		}
		return steps(n - 1, step + 1);
	}
}
