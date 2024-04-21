public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        int smol = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= smol) {
                smol = num;
            } else if (num <= big) {
                big = num;
            } else
                return true;
        }
        return false;
    }
}
