public class MinimumNumberofChangestoMakeBinaryStringBeautiful2914 {
    public static int minChanges(String s) {
        int res = 0, n = s.length();
        for (int i = 1; i < n; i += 2) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                res++;
            }
        }
        return res;
    }
}
