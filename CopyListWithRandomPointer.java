/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
    		return null;

    	
    	RandomListNode current = head,temp=null,next=null;
    	while(current != null){
    		int data = current.label;
    		temp = new RandomListNode(data);
    		next = current.next;
    		current.next = temp;
    		temp.next = next;
    		current = current.next.next;
    	}
    	current = head;
    	while(current != null){
    	    if(current.random != null)
    		    current.next.random = current.random.next;
    		current = current.next.next;
    	}
    	RandomListNode result = null;
    	current = head;
    	while(current != null){
    		next = current.next;
    		if(result == null)
    				result = next;
    		current.next = next.next;
    		current = current.next;
    		if(current != null)
    			next.next = current.next;
    	}
    	
    	return result;
    }
}
