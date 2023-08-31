
public class EvenNumber {

	public static void main(String[] args) {
		System.out.println("Inside For loop");
		for (int i = 2; i <= 50; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("Inside While loop");
		int i = 2;
		while (i <= 50) {
			System.out.println(i);
			i += 2;
		}
		
		System.out.println("Inside Do-While loop");
		int j = 2;
		do {
			System.out.println(j);
			j += 2;

		} while (j <= 50);
	}

}
