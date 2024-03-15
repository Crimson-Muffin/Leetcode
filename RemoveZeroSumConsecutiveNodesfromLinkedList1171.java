import java.util.*;

public class RemoveZeroSumConsecutiveNodesfromLinkedList1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode i = dummy; i != null; i = i.next) {
            sum += i.val;
            map.put(sum, i);
        }

        sum = 0;
        for (ListNode i = dummy; i != null; i = i.next) {
            sum += i.val;
            i.next = map.get(sum).next;
        }
        return dummy.next;
    }
}
