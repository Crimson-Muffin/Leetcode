public class DefusetheBomb1652 {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) {
            return res;
        } else if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int m = 1; m <= k; m++) {
                    sum += code[(i + m) % n];
                }
                res[i] = sum;
            }
            return res;
        } else {
            k = -k;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int m = 1; m <= k; m++) {
                    sum += code[(i - m + n) % n];
                }
                res[i] = sum;
            }
            return res;
        }
    }
}