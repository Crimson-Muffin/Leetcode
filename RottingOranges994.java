import java.util.*;

public class RottingOranges994 {
    public int rottenOranges(int[][] grid) {

        if (grid.length == 0 || grid == null)
            return 0;
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int count_fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] != 0) {
                    count_fresh++;
                }
            }
        }

        if (count_fresh == 0)
            return 0;

        int min = 0, cnt = 0;
        int dx[] = { 0, 0, 1, -1 };
        int dy[] = { 1, -1, 0, 0 };

        while (!q.isEmpty()) {
            int size = q.size();
            cnt += size;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int j = 0; j < 4; j++) {
                    int x = cur[0] + dx[j];
                    int y = cur[1] + dy[j];

                    if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    grid[x][y] = 2;
                    q.offer(new int[] { x, y });
                }
            }
            if (!q.isEmpty()) {
                min++;
            }
        }
        return count_fresh == cnt ? min : -1;
    }
}
