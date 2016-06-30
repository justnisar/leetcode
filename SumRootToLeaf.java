/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumRootToLeaf {
    public int recfun(TreeNode root,int val){
        if(root == null)
            return 0;
        val = val * 10 + root.val;
        if(root.left == null && root.right == null)
            return val;
        return recfun(root.left,val) + recfun(root.right,val);
    }
    public int sumNumbers(TreeNode root) {
        return recfun(root,0);
    }
}
