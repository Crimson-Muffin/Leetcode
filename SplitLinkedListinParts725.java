public class SplitLinkedListinParts725 {
    public ListNode[] splitListToParts(ListNode head, int k){
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }
        int partSize = length / k;
        int remainder = length % k;
        ListNode[] result = new ListNode[k];
        curr = head;
        for(int i = 0; i < k; i++){
            result[i] = curr;
            int size = partSize + (remainder--> 0 ? 1 : 0);
            for(int j = 0; j < size-1; j++){
                curr=curr.next;
            }
            if(curr != null){
                ListNode temp = curr.next;
                curr.next = null;
                curr = temp;
            }
        }
        return result;
    }
}
