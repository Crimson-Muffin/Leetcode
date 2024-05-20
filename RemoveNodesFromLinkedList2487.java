import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

}

public class RemoveNodesFromLinkedList2487 {
    // Naive approach
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode ptr = head;
        while (ptr != null) {
            if (st.isEmpty() || ptr.data > st.peek().data) {
                while (!st.isEmpty() && st.peek().data < ptr.data) {
                    st.pop();
                }
                st.push(ptr);
            }
            ptr = ptr.next;
        }
        ListNode newHead = null;
        while (!st.isEmpty()) {
            ListNode temp = st.pop();
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    // Efficient approach by reversing the linked list
    public ListNode removeNodes2(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode revhead = null;
        revhead = helper(head);
        ListNode ptr = revhead;
        while (ptr.next != null) {
            if (ptr.next.data < ptr.data) {
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }
        ListNode nom = helper(revhead);
        return nom;
    }

    public ListNode helper(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Most efficient approach
    public ListNode removeNodes3(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

        prevNode = head;
        currNode = head.next;

        while (currNode != null) {
            if (currNode.data < prevNode.data) {
                currNode = currNode.next;
            } else {
                ListNode nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
        }
        head.next = null;
        head = prevNode;
        return head;
    }
}
