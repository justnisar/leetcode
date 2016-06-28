/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeSortedLists {
    
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = null; 
        if(l2 == null)
            return l1;
        if(l1 == null)
            return l2;
        
        int a = l1.val;
        int b = l2.val;
        
        if(a <= b){
            head = l1;
            head.next = mergeTwoLists(l1.next,l2);
        }
        else{
            head = l2;
            head.next = mergeTwoLists(l1,l2.next);
        }
            
        return head;
        
    }
}
