public class Majorityelement {
    public int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
        // This is Github co pilot's code
        

    }
}
