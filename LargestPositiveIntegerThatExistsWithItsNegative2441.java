import java.util.*;

public class LargestPositiveIntegerThatExistsWithItsNegative2441 {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(max, Math.abs(num));
            }
            set.add(num);
        }

        return max == 0 ? -1 : max;
    }

    public int findMaxK1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int res = -1;
        for (int k : nums) {
            if (k > 0 && set.contains(-k)) {
                res = Math.max(res, k);
            }
        }
        return res;
    }
}
