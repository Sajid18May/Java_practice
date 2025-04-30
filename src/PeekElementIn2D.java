import java.util.Arrays;

public class PeekElementIn2D {
    public static void main(String[] args) {
        int[][] arr={{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    private static int maxRow(int[][] mat, int col) {
        int rowIndex = 0;
        int maxElm = mat[0][col];
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > maxElm) {
                maxElm = mat[i][col];
                rowIndex = i;
            }
        }
        return rowIndex;
    }

    public static int[] findPeakGrid(int[][] mat) {
        int low = 0, high = mat[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = maxRow(mat, mid);
            int left = ((mid - 1) >= 0) ? mat[row][mid - 1] : -1;
            int right = ((mid + 1) < mat[0].length) ? mat[row][mid + 1] : -1;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
