import java.util.*;

class sortbynum implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}

public class SortCharactersByFrequency451 {
    public static void main(String[] args) {
        String s = "tree";
        Map<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map.entrySet());
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder res = new StringBuilder();
        for (char x : chars) {
            int n = map.get(x);
            for (int i = 0; i < n; i++) {
                res.append(x);
            }
        }
        System.out.println(res.toString());
    }
}
