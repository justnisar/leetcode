package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
         if(head == null ||head.next == null)
     return head;
   ListNode helper = new ListNode(0);
   ListNode prev = helper;
   ListNode current = head;
   ListNode next = null;
   while(current != null){
     
     next = current.next;
     while(prev.next != null && prev.next.val < current.val ){
       prev = prev.next;
     }
     
     current.next = prev.next;
     prev.next = current;
     prev = helper;
     current = next;
   }
   return helper.next;
    }
}
