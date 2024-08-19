class RemoveLinkedListElements203 {
    // Using Only One Pointer
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    // Using Two Pointers
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.data == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    // Using recursion
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode rightSideHead = removeElements(head.next, val);
        if (head.data == val) {
            return rightSideHead;
        }
        head.next = rightSideHead;
        return head;
    }

}