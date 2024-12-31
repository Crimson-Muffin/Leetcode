import java.util.Arrays;

public class UniquePaths62 {
    public static int f(int m, int n) {
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;

        return f(m - 1, n) + f(m, n - 1);
    }

    public static int f1(int m, int n, int[][] dp) {
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n] = f(m - 1, n) + f(m, n - 1);
    }

    public static int uniquePath(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] a : dp)
            Arrays.fill(a, -1);
        dp[0][0] = 1;
        return f1(m - 1, n - 1, dp);
    }

    // Tabulation
    public static int unqpath(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = 1;
                } else {
                    int up = 0;
                    int left = 0;
                    if (i > 0)
                        up = dp[i - 1][j];
                    if (j > 0)
                        left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        // System.out.println(uniquePath(m, n));
        System.out.println(unqpath(m, n));
    }

}
