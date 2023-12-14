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
public class BinaryTreeInorder {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode k;
        TreeNode t;
        while(root != null){
            k = s.push(root);
            root = root.left;
        }
        
        while(s.empty() == false){
            k = s.pop();
            boolean b = l.add(k.val);
            t = k.right;
            while(t != null){
            s.push(t);
            t = t.left;
        }   
        }
        
        
        return l;
    }
}
