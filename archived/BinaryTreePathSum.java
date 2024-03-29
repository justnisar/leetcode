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
public class BinaryTreePathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        sum = sum - root.val;
        if(root.left == null && root.right == null && sum == 0)
            return true;
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
}
