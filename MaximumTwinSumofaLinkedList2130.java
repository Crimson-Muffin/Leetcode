public class MaximumTwinSumofaLinkedList2130 {
    public static int PairSum(ListNode head) {
        if (head.next.next == null) {
            return head.val + head.next.val;
        }
        int res = 0;
        ListNode ptr = head, cptr = head;
        while (cptr != null && cptr.next != null) {
            ptr = ptr.next;
            cptr = cptr.next.next;
        }
        cptr = reverse(ptr);
        ptr = head;
        while (cptr != null) {
            res = Math.max(res, ptr.val + cptr.val);
            ptr = ptr.next;
            cptr = cptr.next;
        }
        return res;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode ptr = head;
        while (ptr != null) {
            ListNode temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;
        }
        return prev;
    }
}
