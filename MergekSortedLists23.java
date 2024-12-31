import java.util.*;

public class MergekSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (ListNode ptr : lists) {
            while (ptr != null) {
                arr.add(ptr.val);
                ptr = ptr.next;
            }
        }
        Collections.sort(arr);
        ListNode head = new ListNode(0);
        ListNode ptr = head;

        for (int x : arr) {
            ptr.next = new ListNode(x);
            ptr = ptr.next;
        }
        return head.next;

    }

    public ListNode mergeLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return Helper(lists, 0, lists.length - 1);
    }

    public ListNode Helper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode left = Helper(lists, start, mid);
        ListNode right = Helper(lists, mid + 1, end);
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
