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
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        if(root != null)
        s1.push(root);
        while( !s1.empty() ){
            TreeNode x = s1.pop();
            s2.push(x);
            if(x.left != null)
                s1.push(x.left);
            if(x.right != null)
                s1.push(x.right);
            
        }
        while(!s2.empty()){
            TreeNode x = s2.pop();
            l.add(x.val);
        }
    return l;
        
    }
}
