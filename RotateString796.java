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
        // char[] arr = new char[2 * s.length()];
        // for (int i = 0; i < s.length(); i++) {
        // arr[i] = s.charAt(i);
        // }
        // for (int i = 0; i < s.length(); i++) {
        // System.out.print(arr[i] + " ");
        // }
        // for (int i = 0; i <s.length();i++){
        // arr[s.length()+i] = arr[i];
        // String temp = new String();
        // }
        // StringBuilder sb = new StringBuilder(s);
        // // System.out.println(sb.toString());
        // for (int i = 0; i < s.length(); i++) {
        // System.out.println("Before -> " + sb.toString());
        // sb.deleteCharAt(0);
        // sb.append(s.charAt(i));
        // System.out.println("After -> " + sb.toString());
        // // System.out.println(sb.toString());
        // if (sb.toString().equals(goal)) {
        // System.out.println("Yes");
        // }
        // }
        // System.out.println("No");

        // s.concat(s)
        System.out.println(rotateString1(s, goal));
    }
}
