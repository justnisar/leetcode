/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedBinaryTree {
    public int max(int a,int b){
        if(a > b)
            return a;
        return b;
    }
    public int height(TreeNode root){
        if(root == null)
            return 0;
        return 1 + max(height(root.left),height(root.right) );
        
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r) <= 1 && isBalanced(root.left) && isBalanced(root.right) )
            return true;
        return false;
    }
}
