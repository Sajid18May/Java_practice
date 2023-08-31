import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entter first Number");
		a=sc.nextInt();
		System.out.println("Entter second Number");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of the numbers = "+c);
		sc.close();
      
	}

}
