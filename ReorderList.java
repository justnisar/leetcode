/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReorderList {
    
    public int countNodes(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public ListNode getMiddleNode(ListNode head){
        int count = countNodes(head);
        count = count/2;
        ListNode current = head;
        while(count-- > 0){
            current = current.next;
        }
        return current;
    }
    
    public ListNode extractLeftPart(ListNode head,ListNode target){
        ListNode current = head;
        while(current.next != target){
            current = current.next;
        }
        current.next = null;
        return head;
    }
    
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null)
            return;
        
        int count = countNodes(head);
        //System.out.println(count);
        ListNode middle = null;
        ListNode left = null,right = null; 
        middle = getMiddleNode(head);
        if(count%2 == 1){
            left = extractLeftPart(head,middle);
            right = middle.next;
            middle.next = null;
        }
        else{
            left = extractLeftPart(head,middle);
            right = middle;
            middle = null;
        }
        
        right = reverseList(right);
        
        ListNode l = left, r = right;
        ListNode lnext = null, rnext = null;
        
        ListNode last = null;
        
        while(l != null && r != null){
            lnext = l.next;
            rnext = r.next;
            l.next = r;
            last = r;
            r.next = lnext;
            l = lnext;
            r = rnext;
            
        }
        
        last.next = middle;
        //return head;
    }
}