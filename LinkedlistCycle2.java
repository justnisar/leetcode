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
public class LinkedlistCycle2 {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            if(fast.next != null)
                fast = fast.next.next;
            else
                fast = fast.next;
            
            slow = slow.next;
            
            if(fast == slow && fast != null && slow != null){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
                
        }
        
        return null;
        
    }
}
