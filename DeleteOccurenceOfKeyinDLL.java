class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
        next = prev = null;
    }
}

class DeleteOccurenceOfKeyinDLL {
    public void deleteKey(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next;
                }
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
            }
            curr = curr.next;
        }
    }
}