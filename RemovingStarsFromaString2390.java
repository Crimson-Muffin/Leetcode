import java.util.Stack;

public class RemovingStarsFromaString2390 {
    // Using stack
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

    // Faster approach
    public String removeStars2(String s) {
        int count = 0;
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                count++;
                continue;
            }
            if (s.charAt(i) != '*' && count > 0) {
                count--;
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}
