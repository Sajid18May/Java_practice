import java.util.Scanner;

public class AutomorphicNumber {
    //Automorphic Number:- number whose square ends with the same digits as the number itself
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result=AutomorphicNumber.isAutomorphicNumber(num)?"Automorphic Number":"not Automorphic Number";
        System.out.println("This is "+result);
    }
    public static boolean isAutomorphicNumber(int num){
        int square=num*num;
        while(num>0){
            int digit=num%10;
            int sdigit=square%10;
            if(digit!=sdigit)
                return false;
            num/=10;
            square/=10;
        }
        return true;
    }
}

