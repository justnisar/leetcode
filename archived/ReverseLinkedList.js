/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
   /*if(head === null || head.next === null )
    return head;*/
   var prev = null;
   var current = head;
   var next;
   while(current !== null){
       next = current.next;
       current.next = prev;
       prev = current;
       current = next;
   }
   return prev;
};