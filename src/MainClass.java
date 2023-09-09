abstract class Calculate
{
    abstract int add(int a, int b);
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {   
            int add(int a, int b)
            {
                return a+b;
            }
        }.add(11010, 022011);
        System.out.println(result);
    }
}