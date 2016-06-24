/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null && n == 1)
            return null;
        
        ListNode slow = head,fast = head,prev = null;
        
        for(int i = 0 ; i < n ; i++)
            fast = fast.next;
            
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        if(slow == head){
            head = head.next;
            return head;
        }
        prev.next = slow.next;
    
    return head;    
    }
    
}
