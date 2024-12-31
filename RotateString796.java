public class RotateString796 {

    // My method
    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }

    // Easy and optimal method
    public static boolean rotateString1(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return s.concat(s).contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString1(s, goal));
    }
}
