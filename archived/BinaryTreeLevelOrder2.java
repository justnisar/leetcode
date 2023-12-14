package archived;

public class BinaryTreeLevelOrder2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Stack<List<Integer>> s = new Stack<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root != null)
            q.add(root);
        q.add(null);
        while(q.peek() != null){
            List<Integer> ll = new ArrayList<Integer>();
            while(true){
                TreeNode x = q.remove();
                if(x == null){
                    q.add(null);        
                    break;
                    
                }
                ll.add(x.val);
                if(x.left != null)
                    q.add(x.left);
                if(x.right != null)
                    q.add(x.right);
            }
            s.add(ll);
        }
    while(!s.empty())
        l.add(s.pop());
    return l;
    }
}
