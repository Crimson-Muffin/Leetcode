public class ReversePrefixofWord2000 {
    public static String reversePrefix(String word, char ch) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                right = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = right; i >= left; i--) {
            sb.append(word.charAt(i));
        }
        sb.append(word.substring(right + 1));
        return sb.toString();
    }
}
