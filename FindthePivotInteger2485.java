public class FindthePivotInteger2485 {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int res = -1;
        for (int i = n / 2; i < n; i++) {
            int sumb = ((i) * (i + 1)) / 2;
            int num = n - i + 1;
            int sumf = (num) * (i) + (num - 1) * (num) / 2;
            if (sumb == sumf) {
                res = i;
            }
        }
        return res;
    }
}
