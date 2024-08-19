import java.util.Arrays;

public class MinimumSwapstoGroupAll1sTogetherII2134 {
    // method 1
    public int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int n = nums.length, cnt = 0;
        for (int i = 0; i < k; i++) {
            cnt += nums[i];
        }
        int mx = cnt;
        for (int i = k; i < n + k; ++i) {
            cnt += nums[i % n] - nums[(i - k + n) % n];
            mx = Math.max(mx, cnt);
        }
        return k - mx;
    }

    // method 2
    public int minSwaps2(int[] data) {
        int ones = 0;
        for (int i : data) {
            ones += i;
        }
        int k = ones;
        int n = data.length;
        int left = 0;
        int right = 0;
        int maxOnes = 0;
        int windowOnes = 0;
        while (right < n) {
            windowOnes += data[right];
            if (right - left + 1 > k) {
                windowOnes -= data[left];
                left++;
            }
            maxOnes = Math.max(maxOnes, windowOnes);
            right++;
        }
        return k - maxOnes;
    }
}
