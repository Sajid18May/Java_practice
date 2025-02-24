public class FloydTriangleRecursive {
    public static void main(String[] args) {
        int size=5;
        printPattern(size,size);
    }

    private static void printPattern(int r, int c) {
        printPatternHelper(r,c,1);
    }

    private static void printPatternHelper(int r, int c, int count) {
        if(r==0)
            return;
        if(c>=r){
            System.out.print(count+" ");
            printPatternHelper(r,c-1,count+1);
        }
        else {
            c=5;
            System.out.println();
            printPatternHelper(r-1,c,count);
        }
    }
}
