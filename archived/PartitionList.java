package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PartitionList {
    
     public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode current=null,prev=null,result=null;
        current = head;
        ListNode result1 = null, prev1 = null;
        while(current != null){
            
            if(current.val >= val && result1 == null){
                result1 = current;
                prev1 = current;
            }
            else if(current.val >= val && result1 != null){
                prev1.next = current;
                prev1 = current;
                
            }
            else if(current.val < val && result == null){
                result = current;
                prev = current;
            }
            else{
                prev.next = current;
                prev = current;
            }
            
            current = current.next;            
            
        }
        
        if(prev != null)
            prev.next = null;
        if(prev1 != null)
            prev1.next = null;
        
        if(result == null)
            return result1;
        else if(result1 == null)
            return result;
        else{
            current = result;
            while(current.next != null)
                current = current.next;
            current.next = result1;
            return result;
        }
        
        
        
    }
    
    public ListNode partition(ListNode head, int x) {
        
        
        
        
        return removeElements(head,x);
        
    }
}