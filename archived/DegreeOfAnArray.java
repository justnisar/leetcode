package archived;

class Node{
	int firstPos;
	int lastPos;
	int frequency;
}
public class Solution {
    
     public int findShortestSubArray(int[] nums) {
		 int length = nums.length;
		 if(length == 0 || length == 1)
			 return length;
		 int max = 0;
		 List<Node> list = new ArrayList<Node>();
		 HashMap<Integer,Node> mapping = new HashMap<Integer,Node>();
		 for(int i = 0 ; i < length ; i++){
			 int current = nums[i];
			 Node node;
			 if(mapping.containsKey(current)){
				 node = mapping.get(current);
				 node.lastPos = i;
				 node.frequency = node.frequency + 1;
			 }
			 else{
				 node = new Node();
				 node.firstPos = i;
				 node.lastPos = i;
				 node.frequency = 1;
				 }
			 mapping.put(current, node);
			 if(node.frequency > max){
				 max = node.frequency;
				 list.clear();
				 list.add(node);
			 }
			 else if(node.frequency == max)
				 list.add(node);
		 }
		 int result = length;
		 for(Node al : list){
			 if(al.lastPos - al.firstPos + 1 < result)
				 result = al.lastPos - al.firstPos + 1;
		 }
		 return result;
	 }
}
