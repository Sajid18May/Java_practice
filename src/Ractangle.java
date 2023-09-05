import java.util.Scanner;

class A {
	Scanner sc=new Scanner(System.in);
	 int length;
	 int width;

}
class area extends A{
	void In() {
		System.out.println("Enter Length");
		 super.length=sc.nextInt();
		System.out.println("Enter width");
		 super.width=sc.nextInt();
	}
	void printArea() {
		System.out.println("Area is "+super.length*super.width);
	}
	
}
class curcumferance extends A{
	
	 void In() { System.out.println("Enter Length"); 
	 super.length=sc.nextInt();
	 System.out.println("Enter width"); 
	 super.width=sc.nextInt(); }
	void printCurcumferance() {
		System.out.println("curcumferance is "+2*(super.length+super.width));
	}
	
}
public class Ractangle{
	public static void main(String[] args) {
		area ar1=new area();
		ar1.In();
		ar1.printArea();
		curcumferance c1=new curcumferance();
		c1.In();
		c1.printCurcumferance();
	}
}

