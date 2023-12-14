package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
            
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            if(prev != null && prev.val == current.val){
                prev.next = current.next;
                current = current.next;
            }
            else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
