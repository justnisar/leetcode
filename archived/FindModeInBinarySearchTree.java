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
   private List<Integer> result;
     private int maxCount;
    private TreeNode prev;
    private int count;
  public Solution(){
    result = new ArrayList<Integer>();
    maxCount = 0;
      prev = null;
      count = 0;
  }
  
  public void recFun(TreeNode root){
    if(root == null)
      return;
    
    recFun(root.left);
    
    if(prev == null){
      count = 1;
    }
    else if(root.val == prev.val){
      count++;
    }
    else{
      count = 1;
    }
    
    if(count > maxCount){
      result.clear();
      result.add(root.val);
      maxCount = count;
    }
    else if(count == maxCount){
      result.add(root.val);
    }
    
    prev = root;
    recFun(root.right);
  }
  
  public int[] findMode(TreeNode root) {
    recFun(root);
    return result.stream().mapToInt((Integer i)->i).toArray();
  }
}
