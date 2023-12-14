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
    private int firstMax;
    private int secondMax;
    public Solution(){
        firstMax = Integer.MAX_VALUE;
        secondMax = Integer.MAX_VALUE;
    }
    
    public void getSecondMax(TreeNode root){
        if(root == null)
            return;
        getSecondMax(root.left);
        if(root.val < firstMax){
            secondMax = firstMax;
            firstMax = root.val;
        }
        else if(root.val > firstMax && root.val < secondMax)
            secondMax = root.val;
        getSecondMax(root.right);
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        getSecondMax(root);
        return secondMax == Integer.MAX_VALUE ? -1 : secondMax;
    }
}
