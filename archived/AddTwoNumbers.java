package archived;

/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;

        ListNode cursor = null;

        int carry = 0;

        while(l1 != null && l2!= null){

            ListNode temp = new ListNode(0);

            int x = l1.val + l2.val + carry;

            temp.val = x % 10;

            if(x > 9)

            carry = 1;

            else

            carry = 0;

            l1 = l1.next;

            l2 = l2.next;

            if(head == null){

                head = cursor = temp;

            }

            else{

                cursor.next = temp;

                cursor = temp;

            }

        }

        //ListNode x = new ListNode(0);

        //f()

        while(l1 != null){

            

            int x = l1.val + carry;

            if(x > 9)

            carry = 1;

            else

            carry = 0;

            l1.val = x % 10;

            cursor.next = l1;

            cursor = l1; 

            l1 = l1.next;

        }

        while(l2 != null){

            

            int x = l2.val + carry;

            if(x > 9)

            carry = 1;

            else

            carry = 0;

            l2.val = x % 10;

            cursor.next = l2;

            cursor = l2;

            l2 = l2.next;

        }

        

        if(carry == 1){

            ListNode x = new ListNode(1);

            cursor.next = x;

        }

        

        

        return head;

    }

}
