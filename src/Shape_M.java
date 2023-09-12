import java.util.Scanner;

interface Shape1 {
	 void getArea(); 
	 Scanner sc=new Scanner(System.in);
 }
 class Rectangle implements Shape1{
	 public void getArea() {
		 System.out.println("** Rectangle **");
		 System.out.println("Enter length");
		 int a=sc.nextInt();
		 System.out.println("Enter Width");
		 int b=sc.nextInt();
		 System.out.println("Area of Rectangle "+a*b);
	 }
 }
 class Circle1 implements Shape1{
	 public void getArea() {
		 System.out.println("** Circle **");
		 System.out.println("Enter radius");
		 int a=sc.nextInt();
		 System.out.println("Area of Circle "+3.14*a*a);
	 }
 }
 class Triangle implements Shape1{
	 public void getArea() {
		 System.out.println("** Triangle **");
		 System.out.println("Enter length of base");
		 int a=sc.nextInt();
		 System.out.println("Enter higth");
		 int b=sc.nextInt();
		 System.out.println("Area of Triangle "+(.5*a*b));
	 }
 }
public class Shape_M {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.getArea();
		Circle1 c1=new Circle1();
		c1.getArea();
		Rectangle r1=new Rectangle();
		r1.getArea();
	}

}
