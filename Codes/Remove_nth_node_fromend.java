package Codes;

public class Remove_nth_node_fromend {
    public class ListNode {
        int val;
        ListNode next;
      ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode iterHead = head;
        ListNode tail = head;
		
		// creating n length distance between tail and iterHead
        for (int i = 0; i < n; i++) {
            iterHead = iterHead.next;
        }
        
		// checks case if head is required to remove node
        if (iterHead == null) {
            return head.next;
        }
        
		//when iterHead will meet end of list tail will point on next to remove node
        while(iterHead != null && iterHead.next != null) {
            iterHead = iterHead.next;
            tail = tail.next;
        }
        
        tail.next = tail.next.next;
        
        return head;
    }
   
}
