import java.util.Scanner;

public class PSA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Have you paid fees ?");
        String paid=sc.nextLine();
        PSA p=new PSA();
        p.job(paid.trim().toLowerCase());
        sc.close();
    }
    void job(String fees){
        if(fees.equals("yes")){
            int offer = (int) (Math.random() * (50 - 6 + 1)) + 6;
            System.out.println("You got a offer of: "+ offer+"LPA");
        }
        else
            System.out.println("Pay your fees !!");
    }

}
