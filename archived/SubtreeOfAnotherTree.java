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
public class SubtreeOfAnotherTree {
    public boolean isSame(TreeNode tree1,TreeNode tree2){
    if(tree1 == null && tree2 == null)
      return true;
    else if(tree1 == null || tree2 == null)
      return false;
    else if(tree1.val != tree2.val)
      return false;
    else 
      return isSame(tree1.left,tree2.left) && isSame(tree1.right,tree2.right);
  }
  
  
  public boolean isSubtree(TreeNode s, TreeNode t) {
   if(s == null && t == null)
     return true;
   else if(s == null || t == null)
     return false;
   return isSame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t); 
  }
}
