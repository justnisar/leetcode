/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
  
    ListNode current = head;
    int count = 0;
    while(current != null && count != k){
      current = current.next;
      count++;
    }
    if(count == k){
      ListNode prev = null;
      ListNode next = null;
      ListNode cur = head;
      while(count-- > 0){
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
      }
      head.next = reverseKGroup(current,k);
      return prev;
    }
    return head;
  }
}
