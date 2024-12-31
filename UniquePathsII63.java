import java.util.Arrays;

public class UniquePathsII63 {
    public static int uniquePathsWithObstacles(int[][] obs) {
        int m = obs.length, n = obs[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(obs, m - 1, n - 1, dp);
    }

    public static int f(int[][] obs, int r, int c, int[][] dp) {
        if (r < 0 || c < 0 || obs[r][c] == 1) {
            return 0;
        }
        if (r == 0 && c == 0) {
            return 1;
        }
        if (dp[r][c] != 1) {
            return dp[r][c];
        }
        int up = f(obs, r - 1, c, dp);
        int left = f(obs, r - 1, c, dp);
        return dp[r][c] = up + left;
    }
}
