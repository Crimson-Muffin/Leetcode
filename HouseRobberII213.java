import java.util.Arrays;

public class HouseRobberII213 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 2 };
        int[] num1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] num2 = Arrays.copyOfRange(nums, 1, nums.length);

        int res1 = HouseRobber198.rob(num1);
        int res2 = HouseRobber198.rob(num2);
        System.out.println(Math.max(res1, res2));
    }
}
