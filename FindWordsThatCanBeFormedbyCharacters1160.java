// You are given an array of strings words and a string chars.

// A string is good if it can be formed by characters from chars (each character can only be used once).

// Return the sum of lengths of all good strings in words.
// Example 1:

// Input: words = ["cat","bt","hat","tree"], chars = "atach"
// Output: 6
// Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

public class FindWordsThatCanBeFormedbyCharacters1160 {
    public int countCharacters(String[] words, String chars){
        int[] counts = new int[26];
        for(int i=0; i<chars.length(); i++){
            counts[chars.charAt(i)-'a']++;
        }
        int sum = 0;

        for(String word: words){
            if(canForm(word, counts)){
                sum += word.length();
            }
        }
        return sum;
    }
    public boolean canForm(String word, int[] counts){
        int[] temp = new int[26];
        for(int i=0; i<word.length(); i++){
            int x = word.charAt(i)-'a';
            temp[x]++;
            if(temp[x]>counts[x]){
                return false;
            }
        }
        return true;
    }
}
