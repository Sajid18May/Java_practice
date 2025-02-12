import java.util.Scanner;

public class NeonNumber {
    //Neon Number		Sum of digits of square of the given number = Original number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int square=num*num,sum=0;

        while(square>0){
            int digit=square%10;
            sum+=digit;
            square/=10;
        }
        if (sum==num)
            System.out.println("It's Neon Number");
        else
            System.out.println("It's not Neon Number");
    }
}
