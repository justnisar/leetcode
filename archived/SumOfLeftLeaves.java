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
public class SumOfLeftLeaves {
    
    public boolean isLeafNode(TreeNode root){
        if(root == null)
            return false;
        else if(root.left == null && root.right == null)
            return true;
        else
            return false;
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        if(isLeafNode(root.left)){
            sum += root.left.val;
        }
        else{
            sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}