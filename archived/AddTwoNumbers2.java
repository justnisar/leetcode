package archived;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers2 {
    int carry = 0;
	public int getLength(ListNode root){
		int count = 0;
		ListNode current = root;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	public ListNode getAccess(ListNode root,int length){
		ListNode current = root;
		while(length-- > 0)
			current = current.next;
		return current;
	}
	
	public ListNode addLists(ListNode first,ListNode second){
		if(first == null && second == null)
			return null;
		int val = first.val + second.val;
		int rem = val % 10;
		if(first.next == null && second.next == null){
			if(val > 9)
				carry = 1;
			else
				carry = 0;
			ListNode temp = new ListNode(rem);
			return temp;
		}
		ListNode next = addLists(first.next,second.next);
		val = val + carry;
		rem = val % 10;
		ListNode current = new ListNode(rem);
		current.next = next;
		if(val > 9)
			carry = 1;
		else
			carry = 0;
		return current;
	}
	
	public ListNode copyList(ListNode root,int count){
		ListNode head = null;
		ListNode current = root,prev = null;
		while(count-- > 0){
			ListNode temp = new ListNode(current.val);
			if(head == null){
				
				head = prev = temp;
				}
			else{
				prev.next = temp;
				prev = current;
				prev = temp;
			}
			current = current.next;
		}
		return head;
	}
	
	public ListNode addOne(ListNode root){
		if(root == null)
			return null;
		if(root.next == null){
			int val = root.val + carry;
			int rem = val % 10;
			if(val > 9)
				carry = 1;
			else
				carry = 0;
			ListNode temp = new ListNode(rem);
			return temp;
		}
		ListNode next = addOne(root.next);
		int val = root.val + carry;
		int rem = val % 10;
		if(val > 9)
			carry = 1;
		else
			carry = 0;
		ListNode current = new ListNode(rem);
		current.next = next;
		return current;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		else if(l2 == null)
			return l1;
		int length1 = getLength(l1);
		int length2 = getLength(l2);
		ListNode first,second,third;
		if(length1 < length2){
			first = getAccess(l2,length2-length1);
			second = l1;
			third = copyList(l2,length2 - length1);
		}
		else if(length1 > length2){
			first = getAccess(l1,length1-length2);
			second = l2;
			third = copyList(l1,length1 - length2);
		}
		else{
			first = l1;
			second = l2;
			third = null;
		}
		ListNode result = addLists(first,second);
		ListNode left = null;
		if(third == null){
			if(carry == 1){
				ListNode result1 = new ListNode(1);
				result1.next = result;
				return result1;
			}
			return result;
		}
		if(third != null){
			if(carry == 1)
				left = addOne(third);
			else
				left = third;
		}
		ListNode current1 = left;
		while(current1.next != null)
			current1 = current1.next;
		current1.next = result;
		if(carry == 1){
			ListNode head1 = new ListNode(1);
			head1.next = left;
			return head1;
		}
			return left;
    }
}