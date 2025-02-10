public class Plindrome {
    public static void main(String[] args) {
        int num=121;
        int og=num,rev=0;
        while(og>0){
            int digit=og%10;//1//2//1
            rev=rev*10+digit;//0*10+1=1//1*10+2=12//12*10+1=121
            og=og/10;//121/10=12//12/10=1//1/10=0
        }
        if(num==rev)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It's not a Palindrome");
    }
}
