import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray1331 {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        int count = 1;
        for (int x : arr1) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x));
            } else {
                map.put(x, count);
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
