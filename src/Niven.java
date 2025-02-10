public class Niven {
    public static void main(String[] args) {
        int num=100;
        int temp=num;
        int sumD=0;
        while(num>0){
            int d=num%10;
            sumD+=d;
            num/=10;
        }
        if(temp%sumD==0)
            System.out.println("It's Niven");
        else
            System.out.println("Not Niven");
    }
}
