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
public class MinDepthBinaryTree {
    
    public int min(int a,int b){
        if(a < b)return a;
        else
        return b;
    }
    public int minDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        else if(root.left != null && root.right != null)
            return 1 + min( minDepth(root.left), minDepth(root.right) );
        else if(root.left != null)
            return 1 + minDepth(root.left);
        else if(root.right != null)
            return 1 + minDepth(root.right);
        else
            return 1;
        
    }
}
