
public class MaximumNum {

	public static void main(String[] args) {
		int num1 = 4, num2 = 7, num3 = 8, num4 = 36;
		if (num1 > num2) {
			if (num1 > num3) {
				if (num1 > num4) {
					System.out.println(num1 + " is Maximum");
				} else {
					System.out.println(num4 + " is Maximum");
				}
			} else {
				if (num3 > num4) {
					System.out.println(num3 + " is Maximum");
				} else {
					System.out.println(num4 + " is Maximum");
				}
			}
		} else {
			if (num2 > num3) {
				if (num2 > num4) {
					System.out.println(num2 + " is Maximum");
				} else {
					System.out.println(num4 + " is Maximum");
				}
			} else {
				if (num3 > num4) {
					System.out.println(num3 + " is Maximum");
				} else {
					System.out.println(num4 + " is Maximum");
				}

			}

		}
	}
}
