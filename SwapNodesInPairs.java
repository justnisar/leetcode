/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * } This is a iterative solution
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

/*
/**   This is a recursive solution
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode next = head.next;
        ListNode nextnext = head.next.next;
        next.next = current;
        current.next = swapPairs(nextnext);
        return next;
    }
}

*/




/*

This is another iterative solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
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





*/
