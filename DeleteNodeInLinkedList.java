/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        
         if(node.next == null)
            node = null;
        else{
            ListNode l = node.next;
            node.val = l.val;
            node.next = l.next;
        }
    }
}
