import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Enter the upper and lower limit for your random number");
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt();
        int min=sc.nextInt();
        sc.close();
        //with Random Class
        Random rn=new Random();
        int randomNumber= rn.nextInt(max-min+1)+min;
        System.out.println("Random number :"+randomNumber);

        //with Math.random() method
        System.out.println("Random number :"+(Math.floor(Math.random()*(max-min+1))+min));
    }
}
