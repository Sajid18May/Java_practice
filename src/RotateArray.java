import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[][] mat={{3,2,1},{6,5,4},{9,8,7}};
        for(int[] i:mat) {
            System.out.println(Arrays.toString(i));
        }
        rotate(mat);
        System.out.println("==========");
        for(int[] i:mat) {
            System.out.println(Arrays.toString(i));
        }
    }
        public static void rotate(int[][] mat) {
            int n=mat.length;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
            for(int i=0;i<n;i++){
                arraysReverse(mat[i]);
            }
        }
        private static void arraysReverse(int[] arr){
            for(int i=0,j=arr.length-1;i<j;i++,j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
}
