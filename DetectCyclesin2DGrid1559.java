public class DetectCyclesin2DGrid1559 {

    public boolean dfs(int i, int j, int previ, int prevj, char[][] grid, boolean[][] vis, char pc) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return false;
        }
        if (grid[i][j] != pc) {
            return false;
        }
        if (vis[i][j]) {
            return true;
        }
        vis[i][j] = true;
        boolean s = i - previ != -1;
        boolean n = i - previ != 1;
        boolean e = j - prevj != -1;
        boolean w = j - prevj != 1;

        return (s && dfs(i + 1, j, i, j, grid, vis, grid[i][j])) || (n && dfs(i - 1, j, i, j, grid, vis, grid[i][j]))
                || (e && dfs(i, j + 1, i, j, grid, vis, grid[i][j])) ||
                (w && dfs(i, j - 1, i, j, grid, vis, grid[i][j]));
    }

    public boolean containsCycle(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && dfs(i, j, 0, 0, grid, vis, grid[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
