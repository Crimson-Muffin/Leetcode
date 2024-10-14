import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings2696 {

    // naive method
    public int minLength(String s) {
        String t = "AB";
        String u = "CD";
        while (s.contains(t) || s.contains(u)) {
            if (s.contains(t)) {
                s = s.replace(t, "");
            } else if (s.contains(u)) {
                s = s.replace(u, "");
            }
        }
        return s.length();
    }

    // using a stack
    public int minLength1(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == 'B' && st.peek() == 'A') {
                st.pop();
            } else if (s.charAt(i) == 'D' && st.peek() == 'C') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }

    public static void main(String[] args) {

    }
}
