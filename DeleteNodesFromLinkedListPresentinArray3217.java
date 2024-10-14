import java.util.HashSet;

public class DeleteNodesFromLinkedListPresentinArray3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            set.add(x);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head, prev = dummy;

        while (ptr != null) {
            ListNode temp = ptr.next;
            if (set.contains(ptr.val)) {
                prev.next = temp;
            } else {
                prev = ptr;
            }
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
