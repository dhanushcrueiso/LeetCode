package Codes;

public class Merge_k_sortled_lists {
    
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode mergeTwoSortedList(ListNode list1,ListNode list2){
        ListNode head = new ListNode(); 
        
        ListNode temp = head;
        do{
            
            if (list1 == null){
                temp.next = list2;
                break;
            }else if (list2 == null){
                temp.next = list1;
                break;
            }
            
            if (list1.val>list2.val){
                temp.next = list2;
                list2 = list2.next;
            }else{
                temp.next = list1;
                list1= list1.next;
            }
            temp = temp.next;
        }while(list1!=null || list2!=null);
        
        return head.next;
    }
        public ListNode mergeKLists(ListNode[] lists) {
        int n= lists.length;
        if (n==0){
            return null;
        }
        
        ListNode currentList = lists[0];
        
        for (int i=1;i<n;i++){
            currentList = mergeTwoSortedList(currentList,lists[i]);
        }
        
        return currentList;
        }

 
    
}
}
