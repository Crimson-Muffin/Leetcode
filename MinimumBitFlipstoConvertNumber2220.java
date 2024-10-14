public class MinimumBitFlipstoConvertNumber2220 {
    public static int minBitFlips(int start, int goal) {
        int res = 0;
        int xor = start ^ goal;
        while (xor > 0) {
            res += xor & 1;
            xor >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 10, b = 7;
        System.out.println(minBitFlips(a, b));
    }

}
