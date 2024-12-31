import java.util.*;

public class Matrix01_542 {
    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] ans = new int[m][n];
        Queue<Pair> q = new LinkedList<>();

        for (int[] a : ans) {
            Arrays.fill(a, -1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    q.offer(new Pair(i, j));
                    ans[i][j] = 0;
                }
            }
        }

        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

        while (!q.isEmpty()) {
            Pair p = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = p.x + dir[i][0];
                int y = p.y + dir[i][1];

                if (x >= 0 && y >= 0 && x < m && y < n && ans[x][y] != -1) {
                    ans[x][y] = ans[p.x][p.y] + 1;
                    q.add(new Pair(x, y));
                }
            }
        }
        return ans;
    }
}