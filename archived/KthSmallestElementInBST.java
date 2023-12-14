package archived;

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}

public class KthSmallestElementInBST {
	
	int global = 0;
	public void recfun(TreeNode root,int k){
		if(root == null)
			return;
		recfun(root.left,k);
		global++;
		if(global == k){
			global = root.val;
			return;
		}
		recfun(root.right,k);
	}
	
	
	public int kthSmallest(TreeNode root, int k) {
		
		recfun(root,0);
		return global;
    }
	
	
	
	
	
}
