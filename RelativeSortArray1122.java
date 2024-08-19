import java.util.*;

public class RelativeSortArray1122 {
    // public int[] relativeSortArray1(int[] arr1, int[] arr2) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < arr1.length; i++) {
    // map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    // }

    // }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        System.out.println(map);
        int[] res = new int[arr1.length];
        int j = 0;
        int sum = 0;
        for (int i : arr2) {
            while (map.getOrDefault(i, 0) > 0) {
                map.put(i, map.getOrDefault(i, 1) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
                res[j++] = i;
            }
        }
        int[] sub = new int[arr1.length - j];
        int indx = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            sub[indx++] = m.getKey();
        }
        Arrays.sort(sub);

        // System.out.println(map);
        indx = 0;
        while (j < arr1.length) {
            res[j++] = sub[indx++];

        }
        for (int i : res) {
            System.out.print(i + " ");
        }
        // System.out.println(sum);
    }

    public int[] relativeSortArray2(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i : arr1) {
            count[i]++;
        }
        int i = 0;
        for (int j : arr2) {
            while (count[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        for (int j = 0; j < count.length; j++) {
            while (count[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}
