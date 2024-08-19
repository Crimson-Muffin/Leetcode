public class NumberofProvinces547 {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, ans = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans++;
                dfs(isConnected, visited, i);
            }
        }
        return ans;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        int n = isConnected.length;
        for (int j = 0; j < n; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
