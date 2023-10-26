import java.util.HashSet;

class LongestConsecutiveSequence128{
    // Made this solution after seeing NeetCode's solution
    public int longestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        int longest = 0;
        for(int x: set){
            if(!set.contains(x-1)){
                int current = x;
                int currentLength = 1;
                while(set.contains(current+1)){
                    current++;
                    currentLength++;
                }
                longest = Math.max(longest, currentLength);
            }
        }
        return longest;
    }
}