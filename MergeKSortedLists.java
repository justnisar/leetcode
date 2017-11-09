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
/*
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
       if(k == 0)
           return null;
        // Initialize a priority queue
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(k,new Comparator<ListNode>(){
			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
        });
        // Add all first elements of lists to priority queue
        for(ListNode list : lists){
        	if(list != null)
        		queue.add(list);
        }
        ListNode result = new ListNode(0);
        ListNode current = result;
        while(!queue.isEmpty()){
        	ListNode temp = queue.poll();
        	if(temp != null){
        		current.next = temp;
        		current = temp;
        		if(temp.next != null)
        			queue.add(temp.next);
        	}
        }
        return result.next;
    }
}

*/


