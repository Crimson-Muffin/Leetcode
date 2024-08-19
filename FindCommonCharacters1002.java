import java.util.*;

public class FindCommonCharacters1002 {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (String word : words) {
            int[] temp = new int[26];
            for (char c : word.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                arr[i] = Math.min(arr[i], temp[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (arr[i] > 0) {
                result.add("" + (char) ('a' + i));
                arr[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindCommonCharacters1002 obj = new FindCommonCharacters1002();
        String[] words = { "bella", "label", "roller" };
        System.out.println(obj.commonChars(words));
    }
}
