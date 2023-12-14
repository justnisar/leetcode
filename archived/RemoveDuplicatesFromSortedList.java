package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode x = null;
        ListNode current = head;
        
        while(current != null && current.next != null){
            
            if(current.val != current.next.val){
                if(x == null){
                    head = x = current;
                }
                else{
                    x.next = current;
                    x = current;
                }
                current = current.next;
            }
            else{
                while(current.next != null && current.val == current.next.val){
                    current = current.next;
                }
                current = current.next;
                //if(x == null){
                    
                //}
                //else{
                //    x.next = current;
                //}
            }
        }
        if(x != null)
            x.next = current;
        else 
            return current;
        return head;
        
    }
}