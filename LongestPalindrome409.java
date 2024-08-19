public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int[] arr = new int[50];
        int count = 0, odd = 0;
        for (char c : s.toCharArray()) {
            arr[c - 'A']++;
        }
        for (int c : arr) {
            if (c % 2 == 0 && c != 0) {
                count += c;
            } else if (c % 2 == 1 && c != 1) {
                count += c - 1;
                odd = 1;
            } else if (c == 1) {
                odd = 1;
            }
        }
        return count + odd;
    }
}
