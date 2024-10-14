import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray1331 {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        HashMap<Integer, Integer> map = new HashMap<>();
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
        // System.out.println(map.entrySet());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
