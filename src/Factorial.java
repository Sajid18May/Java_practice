import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
	    int i=1;
	    int fac=1;
	    while(i<=n) {
	    	fac=fac*i;
	    	i++;
	    }
	  System.out.println("Factorial of the number "+fac);
	  sc.close();
	}

}
