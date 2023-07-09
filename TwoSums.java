import java.util.HashMap;

public class TwoSums {
    // This is the Solution to the Question 1 in Leetcode using brute force method
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target) return new int[] {i,j};
            }
        }
        return new int[] {};
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    // This is the Solution to the Question 1 in Leetcode using HashMap
    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // making the hashmap
        for(int i = 0; i<n; i++){
            map.put(nums[i],i);
        }
        // checking if the complement exists in the hashmap
        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }
        }
        return new int[]{};
    }
}
