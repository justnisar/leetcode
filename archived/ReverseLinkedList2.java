package archived;

/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class ReverseLinkedList2 {

    

    public ListNode reverse(ListNode head){

        if(head == null || head.next == null)

            return head;

        ListNode prev = null,next = null;

        ListNode current = head;

        while(current != null){

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;

        }

        return prev;

    }

    

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(m == n)

            return head;

        ListNode left = null, right = null, prev = null;

        ListNode current = head;

        int i = 1;

        while(current != null){

            if(i == m-1){

                prev = current;

            }

            else if(i == m){

                left = current;

            }

            else if(i == n){

                right = current.next;

                current.next = null;

            }

            

            current = current.next;

            i++;

        }

        

        left = reverse(left);

        

        current = left;

        while(current.next != null)

            current = current.next;

            

        current.next = right;

        

        if(prev == null)

            return left;

        prev.next = left;

        return head; 



        

    }

}
