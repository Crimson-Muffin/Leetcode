import java.util.*;

class Pair {
    int row;
    int col;
    int tm;

    Pair(int _row, int _col, int _tm) {
        this.row = _row;
        this.col = _col;
        this.tm = _tm;
    }
}

public class RottingOranges994 {
    public int rottenOranges(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int[][] vis = new int[n][m];
        int cntFresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }

    }
}
