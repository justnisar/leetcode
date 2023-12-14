package archived;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class DiameterOfABinaryTree {
    int max;
  
  public Solution(){
    max = 0;
  }
  
  public int recfun(TreeNode root){
    if(root == null)
      return 0;
    int leftHeight = recfun(root.left);
    int rightHeight = recfun(root.right);
    if(leftHeight + rightHeight > max)
        max = leftHeight + rightHeight;
    if(leftHeight > rightHeight)
        return 1 + leftHeight;
    return 1 + rightHeight;
  }
  
  public int diameterOfBinaryTree(TreeNode root) {
    recfun(root);
    return max;
  }
}
