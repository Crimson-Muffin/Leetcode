import java.util.Arrays;
import java.util.Map;

public class ValidAnagram {
    // Naive solution using Sorting
    public boolean isAnagram(String s, String t) {
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();

        Arrays.sort(schars);
        Arrays.sort(tchars);

        return Arrays.equals(schars, tchars);
    }
    
    // Using HashMap
    public boolean isAnagram1(String s, String t){
        Map<Character, Integer> count = new HashMap<>();


        for(char x: s.toCharArray()){
            count.put(x, count.getOrDefault(x, 0)+1);
        }

        for(char x: t.toCharArray()){
            count.put(x, count.getOrDefault(x,0)-1);
        }

        for(int val: count.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }



    public boolean isAnagram2(String s, String t) {
        int[] count = new int[26];
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        
        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}
