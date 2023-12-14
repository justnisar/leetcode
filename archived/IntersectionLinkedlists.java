package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionLinkedlists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null)
            return null;
        
        int countA = 0,countB = 0;
        ListNode current = headA;
        while(current != null){
            countA++;
            current = current.next;
        }
        current = headB;
        while(current != null){
            countB++;
            current = current.next;
        }
        ListNode current1 = null;
        if(countA < countB){
            current = headB;
            int count = countB- countA;
            while(count != 0){
                current = current.next;
                count--;
            }
            current1 = headA;
        }
        else if(countA > countB){
            current = headA;
            int count = countA- countB;
            while(count != 0){
                current = current.next;
                count--;
            }
            current1 = headB;
        }
        else{
            current = headA;
            current1 = headB;
        }
        while(current != null){
            if(current == current1)
                return current;
            current = current.next;
            current1 = current1.next;
        }
     return null;   
    }
}
