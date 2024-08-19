import java.util.*;

public class FindWordsContainingCharacter2942 {
    public List<Integer> findWordsContainingCharacter(List<String> words, char character) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).indexOf(character) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}
