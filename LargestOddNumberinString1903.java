public class LargestOddNumberinString1903 {
    public String largestOddNumber(String num) {
        int n = num.length();
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            if ((int) num.charAt(i) % 2 == 1) {
                res = num.substring(0, i + 1);
                break;
            }
        }
        return res;
    }
}
