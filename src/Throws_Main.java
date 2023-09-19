
class Random{
	int a=45,b=2;
	
	void div() throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int c=a/b;
		System.out.println("Division = "+c);
	}
}
public class Throws_Main {

	public static void main(String[] args) {
		Random r1=new Random();
		r1.div();

	}
	protected void finalize() {
		
	}

}
