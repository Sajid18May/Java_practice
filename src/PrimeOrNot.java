import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(PrimeOrNot.primeOrNot(num));
        sc.close();
    }
    public static String primeOrNot(int n){
        if(n==1)
            return n+" is not a Prime number";
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return n+" is not a Prime number";
        }
        return n+" is a Prime number";
    }
}
