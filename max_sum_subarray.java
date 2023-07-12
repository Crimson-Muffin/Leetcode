public class max_sum_subarray {
    public int maxSubArray(int[] nums){
        int max_sum=nums[0];
        int curr_sum=nums[0];
        for(int i = 1;i<nums.length;i++){
            curr_sum=Math.max(nums[i], nums[i]+curr_sum);
            max_sum=Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        max_sum_subarray obj = new max_sum_subarray();
        System.out.println(obj.maxSubArray(arr));
    }
}
