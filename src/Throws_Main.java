
class RandomX {
	int a=45,b=2;
	
	void div() throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int c=a/b;
		System.out.println("Division = "+c);
	}
}
public class Throws_Main {

	public static void main(String[] args) {
		RandomX r1=new RandomX();
		r1.div();

	}

}
