package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode head1 = head;
        ListNode head2 = head.next;
        while(prev != null && current != null){
            if(current != null){
                prev.next = current.next;
                prev = current.next;
            }
            if(prev != null){
                current.next = prev.next;
                current = prev.next;
            }
        }
        current = head1;
        while(current.next != null)
            current = current.next;
        current.next = head2;
        return head1;
    }
}
