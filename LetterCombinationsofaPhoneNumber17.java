import java.util.*;

public class LetterCombinationsofaPhoneNumber17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0)
            return res;
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        helper(res, digits, "", 0, mapping);
        return res;
    }

    private void helper(List<String> res, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            res.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            helper(res, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
