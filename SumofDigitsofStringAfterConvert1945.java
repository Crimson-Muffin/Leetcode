public class SumofDigitsofStringAfterConvert1945 {
    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;
        int n = getLucky(s, k);
        System.out.println(n);
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char num : s.toCharArray()) {
            sb.append(num - 'a' + 1);
        }
        while (k > 0) {
            int temp = 0;
            for (char x : sb.toString().toCharArray()) {
                temp += x - '0';
            }
            sb = new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(sb.toString());
    }
}
