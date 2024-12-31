public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        if (k == 0)
            return head;
        int len = 0;
        ListNode curr = head, ptr = head;
        while (curr != null) {
            len++;
            ptr = curr;
            curr = curr.next;
        }
        k = k % len;
        if (k == 0)
            return head;
        curr = head;
        for (int i = 0; i < len - k - 1; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        ptr.next = head;
        return newHead;
    }
}
