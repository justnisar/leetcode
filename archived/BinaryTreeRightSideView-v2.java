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
public class BinaryTreeRightSideView-v2 {
    
    int max;
    List<Integer> result;
    public Solution(){
        result = new ArrayList<Integer>();
        max = -1;
    }
    
    public void recfun(TreeNode root,int currentLevel){
        if(root == null)
            return;
        if(currentLevel > max){
            result.add(root.val);
            max = currentLevel;
        }
        recfun(root.right,currentLevel + 1);
        recfun(root.left,currentLevel + 1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        recfun(root,0);
        return result;
    }
}
