public class PathwithMaximumGold1219 {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int maxGold = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxGold = Math.max(maxGold, dfs(grid, i, j));
            }
        }
        return maxGold;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);
        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);
        grid[i][j] = temp;
        return temp + Math.max(left, Math.max(right, Math.max(up, down)));
    }
}
