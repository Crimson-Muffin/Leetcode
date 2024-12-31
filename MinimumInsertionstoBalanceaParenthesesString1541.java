import java.util.Stack;

public class MinimumInsertionstoBalanceaParenthesesString1541 {
    public static int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        for (char x : s.toCharArray()) {
            if (x == '(') {
                st.add(x);
            } else if (x == ')' && st.peek() == ')') {
                st.pop();
                st.pop();
            } else if (st.peek() == '(' && x == ')') {
                st.add(')');
            } else if (st.isEmpty() && x == ')') {

            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        String s = "))())(";
        System.out.println(minInsertions(s));
    }
}
