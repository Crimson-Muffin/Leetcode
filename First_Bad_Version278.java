public class First_Bad_Version278 {
    public boolean isBadVersion(int n){
        // dummy function
        return true;
    }
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end-start)/2;
            if(!isBadVersion(mid)){
                start = mid + 1;
            }
            else end = mid;
        }
        return start;
    }
}
