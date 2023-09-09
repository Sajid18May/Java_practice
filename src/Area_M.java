abstract class Shape{
	abstract void RectangleArea(int a,int b);
	abstract void SquareArea(int a);
	abstract void CircleArea(int a);
}
class Area1 extends Shape{
	 void RectangleArea(int a,int b) {
		 System.out.println("Area of Rectangle is "+a*b);
	 }
	 void SquareArea(int a) {
		 System.out.println("Area of Square is "+a*a);
	 }
	 void CircleArea(int a) {
		 System.out.println("Area of Circle is "+(3.14*a*a));
	 }
}
public class Area_M {

	public static void main(String[] args) {
		Area1 a1=new Area1();
		a1.RectangleArea(12,14);
		a1.SquareArea(25);
		a1.CircleArea(7);

	}

}
