public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        int s1 = 0, s2 = 0, n1 = s.length(), n2 = t.length();
        while (s1 < n1 && s2 < n2) {
            if (s.charAt(s1) == t.charAt(s2)) {
                s1++;
            }
            s2++;
        }
        return s1 == n1 ? true : false;
    }
}
