import java.util.Scanner;

public class KrishnamurthyNumber {
    //sum of the factorial of its digits is equal to the original number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int og=num,sum=0;
        while (og>0){
            int digit=og%10;
            sum+=fact(digit);
            og/=10;
        }
        if(sum==num)
            System.out.println("It's KM number");
        else
            System.out.println("It's not KM number");


    }
    public static int fact(int fac){
        int result=1;
        for (int i=1;i<=fac;i++) {
            result*=i;
        }
        return result;
    }
}
