/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConstructBinaryTreeInPost {
    int global;
    public Solution(){
        global = 0;
    }
    
    public int getindex(int[] array,int key){
        int size = array.length;
        for(int i = 0 ; i < size ; i++)
            if(array[i] == key)
                return i;
        return -1;
    }
    
    public TreeNode recfun(int[] preorder,int[] inorder,int a,int b){
        if(a > b){
            return null;
        }
        int val = preorder[global];
        global = global - 1; 
        int index = getindex(inorder,val);
        TreeNode root = new TreeNode(0);
        root.val = val;
        root.right = recfun(preorder,inorder,index + 1,b);
        root.left = recfun(preorder,inorder,a,index - 1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0)
            return null;
        if(inorder.length == 1)
            return new TreeNode(inorder[0]);
        global = inorder.length - 1;
        return recfun(postorder,inorder,0,inorder.length - 1);
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
 */
 /*
public class Solution {
    
    int global;
    public Solution(){
        global = 0;
    }
    
    public int getindex(int[] array,int key){
        int size = array.length;
        for(int i = 0 ; i < size ; i++)
            if(array[i] == key)
                return i;
        return -1;
    }
    
    public TreeNode recfun(int[] preorder,int[] inorder,int a,int b){
        if(a > b){
            return null;
        }
        int val = preorder[global];
        global = global + 1; 
        int index = getindex(inorder,val);
        TreeNode root = new TreeNode(0);
        root.val = val;
        root.left = recfun(preorder,inorder,a,index - 1);
        root.right = recfun(preorder,inorder,index + 1,b);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recfun(preorder,inorder,0,preorder.length - 1);
    }
}





*/


