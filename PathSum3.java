/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSum3 {
    public int recfun(TreeNode root,int sum){
		if(root == null)
			return 0;
		int result = 0;
		if(root.val == sum)
		    result++;
		return result + recfun(root.left,sum - root.val) + recfun(root.right,sum - root.val);
	}
	
	public int pathSum(TreeNode root, int sum) {
		if(root == null)
			return 0;
        return recfun(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
}
