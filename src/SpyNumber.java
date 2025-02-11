public class SpyNumber {
    //Spy Number		Sum of digits = Product of digits
    public static void main(String[] args) {
        int num=346;
        int sum=0,product=1;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            product*=digit;
            num=num/10;
        }
        if(sum==product)
            System.out.println("It's Spy Number");
        else
            System.out.println("It's not a Spy Number");

    }

}
