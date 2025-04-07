import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int L=sc.nextInt();
        double res=0;
        try{
            if(H==0 || L==0){
                throw new Exception("H or L can't be Zero");
            }
            res = (double)1/2 * H * L;
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
