import java.util.Arrays;

public class MinimumPathSum64 {
    public int minpath(int[][] arr, int i, int j, int[][] dp) {
        if (i == 0 && j == 0) {
            return arr[0][0];
        }
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int left = minpath(arr, i, j - 1, dp);
        int up = minpath(arr, i - 1, j, dp);
        return dp[i][j] = Math.min(left, up) + arr[i][j];
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minpath(grid, m - 1, n - 1, dp);
    }
}
