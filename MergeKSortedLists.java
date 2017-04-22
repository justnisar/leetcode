/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        		ArrayList<ListNode> al = new ArrayList<ListNode>();
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){

			@Override
			public int compare(ListNode arg0, ListNode arg1) {
				// TODO Auto-generated method stub
				return arg0.val - arg1.val;
			}});
		ListNode result = new ListNode(0);
		ListNode current = result;;
		int length = lists.length;
		int i = 0;
		for(i = 0 ; i < length ; i++){
			if(lists[i] != null)
				queue.add(lists[i]);
		}
		
		while(!queue.isEmpty()){
			ListNode temp = queue.poll();
			current.next = temp;
			current = current.next;
			if(temp.next != null)
				queue.add(temp.next);
			
		}
		
		
		
		return result.next;
    }
}
