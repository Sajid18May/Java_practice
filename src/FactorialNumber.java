import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        FactorialNumber fn=new FactorialNumber();
        System.out.println("Factorial of "+num+"="+fn.facRe(num));
        System.out.println("Factorial of "+num+"="+fn.facLoop(num));
    }
    public int facLoop(int num){
        int fac=1;
        for(int i=1;i<=num;i++){
            fac*=i;
        }
        return fac;
    }
    public int facRe(int num){
        if(num<=1)
            return 1;
        return num*facRe(num-1);
    }
}
