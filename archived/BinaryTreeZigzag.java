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
public class BinaryTreeZigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root != null)
            q.add(root);
        q.add(null);
        int flag = 0;
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
            if(flag == 1)
                Collections.reverse(ll);
            l.add(ll);
            if(flag == 0)
                flag = 1;
            else
                flag = 0;
        }
    return l;
    }
}

/*

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 /*
public class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
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
            l.add(ll);
        }
    return l;
        
    }
}


*/
