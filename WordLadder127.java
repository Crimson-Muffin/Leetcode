import java.util.*;

public class WordLadder127 {
    class Pair {
        String first;
        int second;

        Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> set = new HashSet<>(wordList);
        set.remove(beginWord);

        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.poll().second;
            if (word.equals(endWord)) {
                return steps;
            }

            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replaced[] = word.toCharArray();
                    replaced[i] = ch;
                    String newWord = new String(replaced);

                    if (set.contains(newWord)) {
                        set.remove(newWord);
                        q.offer(new Pair(newWord, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
}