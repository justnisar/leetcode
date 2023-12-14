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
    
    public int getMaxIndex(int[] nums,int start,int end){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = start ; i <= end ; i++)
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        return maxIndex;
    }
    
    public TreeNode getMaxTree(int[] nums,int start,int end){
        if(start > end)
            return null;
        int mid = getMaxIndex(nums,start,end);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getMaxTree(nums,start,mid - 1);
        root.right = getMaxTree(nums,mid + 1,end);
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getMaxTree(nums,0,nums.length - 1);
    }
}
