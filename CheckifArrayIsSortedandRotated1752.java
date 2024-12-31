import java.util.Arrays;

public class CheckifArrayIsSortedandRotated1752 {

    // working code
    public boolean checking(int[] nums) {
        int count = 0, n = nums.length;
        if (nums[0] < nums[n - 1]) {
            count++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    // doesn't work
    public static boolean check(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        int min = Integer.MAX_VALUE;
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                ind = i;
            }
        }
        ind = ind - 1;
        helper(0, nums.length - 1, nums);
        int resind = nums.length - ind;
        helper(0, resind - 1, nums);
        helper(resind, nums.length - 1, nums);
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sorted[i]) {
                System.out.println("Not a rotated array");
                return false;
            }
        }
        return true;
    }

    public static void helper(int start, int end, int[] arr) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
