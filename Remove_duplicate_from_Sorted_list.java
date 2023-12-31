public class Remove_duplicate_from_Sorted_list {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;
        while(ptr != null){
            if(ptr.next == null) break;
            if(ptr.val == ptr.next.val){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }
        return head;
    }
}
