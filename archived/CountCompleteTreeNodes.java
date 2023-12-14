package archived;

public class CountCompleteTreeNodes {
    
    public int leftHeight(TreeNode root){
        if(root == null)
            return 0;
        int height = 0;
        while(root != null){
            height++;
            root = root.left;
        }
        return height;
    }
    public int rightHeight(TreeNode root){
        if(root == null)
            return 0;
        int height = 0;
        while(root != null){
            height++;
            root = root.right;
        }
        return height;
    }
    
    public int countNodes(TreeNode root) {
        
        if(root == null)
            return 0;
        int left = 1 + leftHeight(root.left);
        int right = 1 + rightHeight(root.right);
        if(left == right)
            return (2<<(left-1)) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}