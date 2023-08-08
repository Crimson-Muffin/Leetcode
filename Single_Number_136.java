public class Single_Number_136 {
    int singleNumber(int[] nums) {
        // declaring a variable to store the length of the array
        int n = nums.length;
        // declaring a variable to store the result
        int result = 0;
        // using the XOR operator to find the single number
        for(int i = 0; i<n; i++){
            // XOR operator
            result ^= nums[i];
        }
        // returning the result
        return result;
    }
}
