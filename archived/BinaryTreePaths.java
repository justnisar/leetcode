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
public class BinaryTreePaths {
    List<String> l;
    
    public void recPath(TreeNode root,String s){
        if(root == null)
            return;
        if(root.left != null && root.right != null){
            s += root.val;
            s += "->";
            recPath(root.left,s);
            recPath(root.right,s);
        }
        else if(root.left != null){
            s += root.val;
            s += "->";
            recPath(root.left,s);
        }
        else if(root.right != null){
            s += root.val;
            s += "->";
            recPath(root.right,s);
        }
        else if(root.left == null && root.right == null){
            s += root.val;
            l.add(s);
        }
            
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        l = new ArrayList<String>();
        recPath(root,s);
        return l;
    }
}
