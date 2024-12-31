public class MaximumSubarray53 {

    // one method
    public int maxSubArray(int[] nums) {
        // Initializing max sum and curr sum
        int max_sum = nums[0];
        int curr_sum = nums[0];
        // for loop to find the max sum and curr sum
        for (int i = 1; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], nums[i] + curr_sum);
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }

    // other method
    public int maxSubarray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaximumSubarray53 obj = new MaximumSubarray53();
        System.out.println(obj.maxSubArray(arr));
    }
}
