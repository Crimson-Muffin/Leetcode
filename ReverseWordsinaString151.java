public class ReverseWordsinaString151 {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                res.append(words[i]).append(" ");
            }
        }
        return res.length() == 0 ? "" : res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        ReverseWordsinaString151 obj = new ReverseWordsinaString151();
        System.out.println(obj.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(obj.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(obj.reverseWords("a good   example")); // Output: "example good a"
    }
}
