public class RecursiveCount0 {
    public static void main(String[] args) {
        int num=430340320;
        System.out.println(count0(num));
    }

    private static int count0(int num) {
        return helper( num,0);
    }

    private static int helper(int num, int count) {
        if(num==0)
            return count;
        if(num%10==0){
            return helper(num/10,count+1);
        }
        return helper(num/10,count);
    }
}
