public class SumofSquaresofSpecialElements2778 {
    public static int sumOfSquares(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                res += nums[i] * nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 1, 19, 18, 3 };
        System.out.println(sumOfSquares(nums));
    }
}
