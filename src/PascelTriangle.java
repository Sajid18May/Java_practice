import java.util.Arrays;

public class PascelTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(pascalTriangle(3)));
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] mat=new int[N][];
        for(int i=1;i<=N;i++){
            int[] row=new int[i];
            for(int j=1;j<=i;j++){
                row[j-1]=nCr(i-1,j-1);
            }
            mat[i-1]=row;
        }
        return mat;
    }
    public static int nCr(int n,int r){
        int res=1;
        for (int i =1 ; i <=r-1 ; i++) {
            res=res*n-i;
            res=res/i;               //5c2=5*4/2*1
        }
        return res;
    }
}
