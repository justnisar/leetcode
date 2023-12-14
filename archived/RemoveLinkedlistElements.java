package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedlistElements {
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode current=null,prev=null,result=null;
        current = head;
        while(current != null){
            
            if(current.val == val && result == null){
                
            }
            else if(current.val == val && result != null){
                prev.next = current.next;
                
            }
            else if(current.val != val && result == null){
                result = current;
                prev = current;
            }
            else{
                prev = current;
            }
            
            current = current.next;            
            
        }
        
        return result;
        
    }
}
