public class SerialMatrix {
    public static void main(String[] args) {
        int[] [] Matrix= { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMatrixPrint(Matrix);
    }

    private static void spiralMatrixPrint(int[][] matrix) {
        int top=0;
        int bottom =matrix.length-1;
        int right =matrix[0].length-1;
        int left =0;
        int count=matrix.length*matrix[0].length;
        while(count>0){
            for (int i = top; i <= right; i++) {
                System.out.println(matrix[top][i]);
                count--;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
                count--;
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(matrix[bottom][i]);
                count--;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                System.out.println(matrix[i][left]);
                count--;
            }
            left++;

        }
    }
}
