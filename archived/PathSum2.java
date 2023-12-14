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
class Solution {
    private List<List<Integer>> result;
  
  public Solution(){
    result = new ArrayList<List<Integer>>();
  }
  
  public void recFun(TreeNode root,int sum,List<Integer> temp){
    if(root == null)
      return;
    int target = sum - root.val;
    temp.add(root.val);
    if(target == 0 && root.left == null && root.right == null)
      result.add(new ArrayList<Integer>(temp));
    if(root.left != null){
        recFun(root.left,target,temp);
        temp.remove(temp.size() - 1);
    }
    if(root.right != null){ 
        recFun(root.right,target,temp);
        temp.remove(temp.size() - 1);
    }

  }
  
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    
    List<Integer> temp = new ArrayList<Integer>();
    recFun(root,sum,temp);
    
    return result;
  }

}
