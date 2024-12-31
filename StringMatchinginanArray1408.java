import java.util.*;

public class StringMatchinginanArray1408 {

    // Naive Brute Force Method
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (String x : words) {
            for (String y : words) {
                if (x.contains(y) && !x.equals(y) && !res.contains(y)) {
                    res.add(y);
                }
            }
        }
        return res;
    }
    // Optimized Method

    public boolean check(String word, String[] words, int index) {
        for (int i = 0; i < words.length; i++) {
            if (index != i && words[i].contains(word)) {
                return true;
            }
        }
        return false;
    }

    public List<String> stringMatching1(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int index = i;
            if (check(words[i], words, index)) {
                list.add(words[i]);
            }
        }
        return list;
    }
}
