class RemoveOutermostParentheses1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ')')
                count--;
            if (count >= 1)
                res.append(c);
            if (c == '(')
                count++;
        }
        return res.toString();
    }
}