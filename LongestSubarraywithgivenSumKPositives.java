public class LongestSubarraywithgivenSumKPositives {
    public static int longestSubArray(int[] arr, int s) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == s) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 5, 1, 9 };
        int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;

        System.out.println(longestSubArray(arr, k));

        // int res = 0;
        // int left = 0, right = 1;
        // int sum = 0;
        // while (right < n) {
        // sum += arr[left];
        // System.out.println("At the start sum is" + sum);
        // while (sum < k) {
        // sum += arr[right];
        // System.out.println(sum);
        // if (sum == k) {
        // int temp = right - left + 1;
        // if (temp > res) {
        // res = temp;
        // }
        // left = left + 1;
        // right = left + 1;
        // }
        // right++;
        // }
        // System.out.println(res);
        // }

        // System.out.println(longestSubArray(arr, k, n));
    }
}
