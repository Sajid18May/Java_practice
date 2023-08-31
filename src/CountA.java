import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		char name[]=new char[5];
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			name[i]=s.charAt(i);
		}
		System.out.print("User name is ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]);
			if(name[i]=='A'||name[i]=='a') {
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("Number of A in your name "+ count);
		sc.close();

	}

}
