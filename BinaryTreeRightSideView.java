/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeRightSideView {
    Queue<TreeNode> q;
    public Solution(){
        q = new LinkedList<TreeNode>();
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null)
            return l;
        q.add(root);
        q.add(null);
        TreeNode prev = null;
        while(q.size() != 0){
            while(true){
            TreeNode x = q.remove();
            if(x == null){
                
                if(prev != null)
                 l.add(prev.val);
                if(q.size() != 0)
                 q.add(null);
                break;
            }
            if(x.left != null){
                q.add(x.left);
                
            }
            if(x.right != null){
                q.add(x.right);
                
            }
            prev = x;
            }
        }
        return l;
    }
}
