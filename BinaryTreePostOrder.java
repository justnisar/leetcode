/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePostOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        if(root != null)
            s.push(root);
            
        while(s.empty() != true){
            TreeNode t = s.pop();
            l.add(t.val);
            if(t.right != null)    
                s.push(t.right);
            if(t.left != null)
                s.push(t.left);
        }
     return l;   
    }
}
