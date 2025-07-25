public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int minutes = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                if ((i > 0 && i != m - 1 && j > 0 && j != m - 1 && grid[i][j] == 1) && grid[i - 1][j] == 2 || grid[i + 1][j] == 2 || grid[i][j - 1] == 2 || grid[i][j + 1] == 2) {
                    grid[i][j] = 2;
                } else {
                    return -1;
                }

            }

        }


        return minutes;
    }
}
