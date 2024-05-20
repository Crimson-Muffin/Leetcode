public class IntersectionofTwoLinkedLists160 {
    public ListNode getIntersection(ListNode h1, ListNode h2) {
        if (h1 == null || h2 == null)
            return null;
        ListNode ptr1 = h1, ptr2 = h2;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if (ptr1 == ptr2) {
                return ptr1;
            }
            if (ptr1 == null)
                ptr1 = h2;
            if (ptr2 == null)
                ptr2 = h1;
        }
        return ptr1;
    }
}
