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
public class ValidBST {
    TreeNode global;
    public Solution(){
        global = null;
    }
    public boolean recfun(TreeNode root,TreeNode prev){
        if(root == null)
            return true;
        boolean a = recfun(root.left,root);
        boolean c;
            if(global == null){
                global = root;
                c = true;
            }
            else if(root.val > global.val){
                global = root;
                c = true;
            }
            else{
                c = false;
            }
        boolean b = recfun(root.right,root);
        return a&&b&&c;
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        return recfun(root,null);
        
    }
}

/*
Simpler Recursion
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
    
    public boolean recFun(TreeNode root,long min,long max){
        if(root == null)
            return true;
        return !(root.val >= max || root.val <= min) && recFun(root.left,min,root.val) && recFun(root.right,root.val,max);
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        else if(root.left == null && root.right == null)
            return true;
        return recFun(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}




*/




