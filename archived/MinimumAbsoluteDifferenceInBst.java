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
public class MinimumAbsoluteDifferenceInBst {
  private int result;
  private TreeNode prev;
  public Solution(){
    result = Integer.MAX_VALUE;
    prev = null;
  }
  
  public void printInOrder(TreeNode root){
    if(root == null)
      return;
    printInOrder(root.left);
    //System.out.println(root.val);
    if(prev != null){
      //System.out.println("Difference = " + Math.abs(root.val - prev.val));
      result = Math.min(result, Math.abs(root.val - prev.val));
    }
    prev = root;
    printInOrder(root.right);
  }
  
    public int getMinimumDifference(TreeNode root) {
printInOrder(root);
    return result;
    }
}
