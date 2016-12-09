/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeMaxPathSum {
    
    public int max(int a,int b,int c){
        if(a >= b && a >= c){
            return a;
        }
        else if(b >= a && b >= c){
            return b;
        }
        return c;
    }
    
    public int max(int a,int b){
        if(a > b)
            return a;
        return b;
    }
    int max = Integer.MIN_VALUE;
    
    public int recfun(TreeNode root){
        // base case
        if(root == null)
            return 0;
        int leftsum = Integer.MIN_VALUE,rightsum = Integer.MIN_VALUE;
        if(root.left != null)
            leftsum = recfun(root.left);
        if(root.right != null)
            rightsum = recfun(root.right);
        
        if(leftsum == Integer.MIN_VALUE && rightsum == Integer.MIN_VALUE){
            if(root.val > max){
                max = root.val;
            }
            return root.val;
        }
        else if(leftsum == Integer.MIN_VALUE){
            
            int x = max(rightsum,rightsum + root.val,root.val);
            if(x > max)
                max = x;
            
            return max(rightsum + root.val,root.val);
        }
        else if(rightsum == Integer.MIN_VALUE){
            int y = max(leftsum,leftsum + root.val,root.val);
            if(y > max)
                max = y;
            return max(leftsum + root.val,root.val);
        }
        else{
            int x = max(leftsum,rightsum,leftsum + root.val + rightsum);
            int y = max(leftsum + root.val,rightsum + root.val,root.val);
            int z = max(x,y);
            if(z > max)
                max = z;
            return y;    
        }
            
        
        
    }
    
    
    public int maxPathSum(TreeNode root) {
        int x = recfun(root);
        if(x > max)
            max = x;
        return max;
    }
}