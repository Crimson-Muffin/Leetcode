class FindtheDuplicateNumber287{
    // Hashset approach
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();
        for(int x:nums){
            if(!map.add(x)){
                return x;
            } 
        }
        return 0;
    }
    // changing the index (much better)
    public int findDuplicate1(int[] nums) {
        int len = nums.length;
        for(int x:nums){
            int idx = Math.abs(x);
            if(nums[idx]<0){
                return idx;
            }
            nums[idx] =-nums[idx];
        }
        return len;
    }
    
}
