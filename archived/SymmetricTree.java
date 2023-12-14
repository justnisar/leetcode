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
public class SymmetricTree {
    public boolean recfun(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        else if(root1!= null && root2 != null && root1.val == root2.val)
            return recfun(root1.left,root2.right) && recfun(root1.right,root2.left);
        else
            return false;
    }
    public boolean isSymmetric(TreeNode root) {
        return recfun(root,root);
    }
}
