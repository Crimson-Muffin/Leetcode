import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs1913 {
    public int maxProductDifference(int[] nums) {
        // Brute Force
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }

    public int maxProductDifference2(int[] nums) {
        // Optimized
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return (max1 * max2) - (min1 * min2);
    }

    private int[] getMaxMin(int[] nums) {
        int len = nums.length;
        int maxi = 0, mini = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxi = i;
            }
            if (nums[i] < min && nums[i] != Integer.MIN_VALUE) {
                min = nums[i];
                mini = i;
            }
        }

        nums[maxi] = Integer.MIN_VALUE;
        nums[mini] = Integer.MIN_VALUE;

        return new int[] { max, min };
    }
}
