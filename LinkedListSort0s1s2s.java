class ListNode {
    int data;
    ListNode next;

    ListNode() {
    }

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSort0s1s2s {
    public ListNode sortList(ListNode head) {
        ListNode ptr = head;
        int count0 = 0, count1 = 0, count2 = 0;
        while (ptr != null) {
            if (ptr.data == 0) {
                count0++;
            } else if (ptr.data == 1) {
                count1++;
            } else {
                count2++;
            }
            ptr = ptr.next;
        }
        ptr = head;
        while (ptr != null) {
            if (count0 > 0) {
                ptr.data = 0;
                count0--;
            } else if (count1 > 0) {
                ptr.data = 1;
                count1--;
            } else {
                ptr.data = 2;
                count2--;
            }
            ptr = ptr.next;
        }
        return head;
    }

    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode zeroHead = new ListNode(0), zero = zeroHead;
        ListNode oneHead = new ListNode(0), one = oneHead;
        ListNode twoHead = new ListNode(0), two = twoHead;
        ListNode current = head;
        while (current != null) {
            if (current.data == 0) {
                zero.next = current;
                zero = zero.next;
            } else if (current.data == 1) {
                one.next = current;
                one = one.next;
            } else {
                two.next = current;
                two = two.next;
            }
        }
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

}
