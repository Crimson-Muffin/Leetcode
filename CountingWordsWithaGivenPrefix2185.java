public class CountingWordsWithaGivenPrefix2185 {
    public int countWordsWithGivenPrefix(String[] words, String prefix) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }

    public int countWordsWithGivenPrefix1(String[] words, String prefix) {
        int count = 0;
        for (String word : words) {
            if (word.indexOf(prefix) == 0) {
                count++;
            }
        }
        return count;
    }
}
