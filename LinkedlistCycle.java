/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedlistCycle {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            if(fast.next != null)
                fast = fast.next.next;
            else
                fast = fast.next;
            
            slow = slow.next;
            
            if(fast == slow && fast != null && slow != null)
                return true;
        }
        
        return false;
        
    }
}
