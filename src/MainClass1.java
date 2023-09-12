
public class MainClass1
{
    public static void main(String[] args)
    {
        try {
        	int a[]=new int[7];
        	a[7]=67;
        	
		} 
        catch (ArithmeticException e) {	
			System.out.println(e);

		}
        catch (ArrayIndexOutOfBoundsException e1) {	
			System.out.println(e1);

		}
        finally {
        	System.out.println("Exit...");
        }
    }
}