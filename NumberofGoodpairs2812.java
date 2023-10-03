import java.util.HashMap;

public class NumberofGoodpairs2812 {
    // Using bruteforce to solve this problem
    public int numIdenticalPairs1(int[] nums){
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }



    // Using HashMap to solve this problem
    public int numIdenticalPairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int num: nums){
            ans += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num,0));
        }
        return ans;
    }
}
