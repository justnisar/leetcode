/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        queue.add(null);
        TreeLinkNode prev = null;
        while(!queue.isEmpty()){
            TreeLinkNode current = queue.poll();
            if(current == null && queue.isEmpty()){
                prev.next = null;
                return;
            }
            if(current == null && !queue.isEmpty()){
                queue.add(null);
                prev.next = null;
                prev = null;
                continue;
            }
            if(prev != null){
                prev.next = current;
                
            }
            prev = current;
            
            if(current.left != null)
                queue.add(current.left);
            if(current.right != null)
                queue.add(current.right);
                
        }
    }
}
