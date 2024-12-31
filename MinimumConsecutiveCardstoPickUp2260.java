import java.util.HashMap;

public class MinimumConsecutiveCardstoPickUp2260 {
    public static int minimumCardPickup(int[] cards) {
        int min = Integer.MAX_VALUE, n = cards.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                min = Math.min(i - map.get(cards[i]) + 1, min);
            }
            map.put(cards[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[] cards = { 3, 4, 2, 3, 4, 7 };
        System.out.println(minimumCardPickup(cards));
    }
}
