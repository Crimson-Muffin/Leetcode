public class addTwoNumbers {
    public ListNode addTwonumbers(ListNode l1, ListNode l2){
        // Initializing a dummy head node
        ListNode dummyhead = new ListNode(0);
        // Initializing a tail node
        ListNode tail = dummyhead;
        // Initializing a carry variable
        int carry = 0;
        // While loop to iterate through the linked list
        while(l1!=null || l2!=null){
            // Initializing a sum variable
            int sum = carry;
            // If l1 is not null, add the value of l1 to sum and move l1 to the next node
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;;
            }
            // If l2 is not null, add the value of l2 to sum and move l2 to the next node
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            // If sum is greater than 10, then carry is 1
            // Else carry is 0
            // Add the value of sum%10 to the tail node
            tail.next = new ListNode(sum%10);
            // Move the tail node to the next node
            tail = tail.next;
            // Update the carry variable
            carry = sum/10;
        }
        // If carry is greater than 0, then add a new node to the tail node
        if(carry>0){
            tail.next = new ListNode(carry);
        }

        return dummyhead.next;
    }
}
