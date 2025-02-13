package reverse;

public class reverse {
    public static void main(String[] args) {
        int num=4356;//rev=6534

        StringBuffer s=new StringBuffer(String.valueOf(num));
        //StringBuffer rev=s.reverse();
        System.out.println("reversed Number is :"+s.reverse());
    }
}
