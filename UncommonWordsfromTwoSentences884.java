import java.util.*;

public class UncommonWordsfromTwoSentences884 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] s1sp = s1.split(" ");
        String[] s2sp = s2.split(" ");

        HashSet<String> eliminated = new HashSet<>();
        HashSet<String> res = new HashSet<>();

        for (String x : s1sp) {
            if (!res.contains(x) && !eliminated.contains(x)) {
                res.add(x);
            } else if (res.contains(x) || eliminated.contains(x)) {
                res.remove(x);
                eliminated.add(x);
            }
        }
        for (String x : s2sp) {
            if (!res.contains(x) && !eliminated.contains(x)) {
                res.add(x);
            } else if (res.contains(x) || eliminated.contains(x)) {
                res.remove(x);
                eliminated.add(x);
            }
        }

        // System.out.println(res);

        String[] arr = new String[res.size()];
        res.toArray(arr);
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
