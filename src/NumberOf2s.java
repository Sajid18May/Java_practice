
public class NumberOf2s {
	public static void main(String[] args) {
		int num = 23445212;
		System.out.println(count2s(num));
	}

	private static int count2s(int num) {

		return steps(num, 0);
	}

	private static int steps(int num, int count) {
		if(num==0) {
			return count;
		}
		
		if(num%10==2)
			return steps(num/10,count+1);
		
		return steps(num/10,count);
	}

}
