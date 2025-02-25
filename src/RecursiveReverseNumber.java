import java.util.Scanner;

public class RecursiveReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+" after being reversed :"+revRe(n));
        sc.close();
    }

    private static int revRe(int n) {//1234 ==> 4321 // 4*pow(10,noofdigit-1)
        if(n==0)
            return 0;
        int noOfDigit=(int)Math.log10(n)+1;// log10 5000 = log10 (5*10^3)= log10 5 + log10 10^3= .545+ 3 *1=3.545//3
        return revHelper(n,noOfDigit);
    }

    private static int revHelper(int n, int noOfDigit) {
        if(n==0)
            return 0;
        return (n%10)*(int)Math.pow(10,noOfDigit-1)+revHelper(n/10,noOfDigit-1);
    }


}
