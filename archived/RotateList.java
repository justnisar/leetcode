package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RotateList {
    
    public int getLength(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            ++count;
        }
        return count;
    }
    
    public int getLast(ListNode head){
        ListNode current = head;
        while(current.next != null)
            current = current.next;
        return current.val;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
            return null;
        if(head.next == null)  
            return head;
        if(k == 0)
            return head;
        
        int length = getLength(head);
        
        k = k % length;
        
        if(k == 0)
            return head;
        
        int to_move = length - k;
        
        ListNode prev = null;
        ListNode current = head;
        ListNode head1 = head;
        while(to_move -- > 0){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        
        head = current;
        while(current.next != null)
            current = current.next;
        
        current.next = head1;
        return head;
    }
}


