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
class Solution {
    int sum;
    public Solution(){
        sum = 0;
    }
    
    public void recFun(TreeNode root){
        if(root == null)
            return;
        recFun(root.right);
        int oldRootValue = root.val;
        root.val = root.val + sum;
        sum += oldRootValue;
        recFun(root.left);
    }
    
    public TreeNode convertBST(TreeNode root) {
        recFun(root);
        return root;
    }
}
