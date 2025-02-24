public class Pattern1Recursion {
    public static void main(String[] args) {
        int n=7;
        patternRe(n);
    }

    private static void patternRe(int n) {
        patternReHelper(n,n);
    }

    private static void patternReHelper(int r, int c) {
        if(r<=1){
            System.out.println(1);
            return;
        }
        if(c>=1){
            System.out.print(c);
            patternReHelper(r,c-1);
        }
        else {
            System.out.println();
            patternReHelper(r - 1, r - 1);
        }
    }
}
