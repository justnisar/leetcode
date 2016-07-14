/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        
        // Base Case
        if(head == null || head.next == null)
            return head;
        
        ListNode current = head,prev = null, next = null,temp = null, result = null;
        
        while(current != null && current.next != null){
            
            next = current.next;
            temp = next.next;
            next.next = current;
            current.next = temp;
            
            if(prev == null){
                result = next;
                prev = current;
            }
            else{
                prev.next = next;
                prev = current;
            }
            current = current.next;
        }
        
        return result;
    }
}
