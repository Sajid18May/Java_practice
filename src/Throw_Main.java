
public class Throw_Main {

	public static void main(String[] args) {
		int a=20,b=0;
		if(b==0) {
			throw new ArithmeticException ("exp");
		}
		else {
			int c=a/b;
			System.out.println("Division = "+c);
		}
	}

}
