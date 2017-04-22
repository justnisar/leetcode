tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FlattenBinaryTreeToLinkedList {
    public TreeNode recfun(TreeNode root){
		if(root == null)
			return null;
		TreeNode left = root.left;
		TreeNode right = root.right;
		if(left != null){
			root.right = left;
			root.left = null;
			root = recfun(left);
		}
		if(right != null){
			root.right = right;
			root = recfun(right);
		}
		return root;
	}
	
	public void flatten(TreeNode root) {
		TreeNode result = recfun(root);
    }
}
