public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(PowerOfTwo.isPowerOfTwoWithBitShift(128));
    }
    public static boolean isPowerOfTwo(int n){
        int i=0;
        while(i<=31){
            if(Math.pow(2,i++)==n)
                return true;
        }
        return false;
    }
    public static boolean isPowerOfTwoWithBitShift(int n){
        return ( n>0 && (n & (n-1))==0);
    }
}
