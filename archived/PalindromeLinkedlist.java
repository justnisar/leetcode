package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedlist {
    
    // Method to get the length of the linked list
    public int getLength(ListNode current){
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
    // Method to get the reverse of Linked List
    public ListNode getReverse(ListNode head){
        // base case
        if(head == null || head.next == null)
            return head;
            
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    
    
    public boolean isPalindrome(ListNode head) {
        int length = getLength(head);
        int position = 0;
        if(length % 2 == 0)
            position = length / 2;
        else
            position = length/2 + 1;
        
        ListNode current = head;
        int count = 0;
        while(count != position){
            current = current.next;
            count++;
        }
        
        ListNode head2 = getReverse(current);
        current = head;
        ListNode current2 = head2;
        while(current != null && current2 != null){
            if(current.val != current2.val)
                return false;
            
            current = current.next;
            current2 = current2.next;
        }
        
        return true;
        
        
    }
}
