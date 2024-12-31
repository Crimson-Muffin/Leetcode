public class PalindromeLinkedList234 {

    public boolean isPallindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode ptr = head, cptr = head;
        while (ptr != null && ptr.next != null) {
            ptr = ptr.next.next;
            cptr = cptr.next;
        }

        ListNode prev = null;
        while (cptr != null) {
            ListNode temp = cptr.next;
            cptr.next = prev;
            prev = cptr;
            cptr = temp;
        }

        ptr = head;
        cptr = prev;
        while (cptr != null) {
            if (ptr.val != cptr.val) {
                return false;
            }
            ptr = ptr.next;
            cptr = cptr.next;
        }
        return true;
    }
}
