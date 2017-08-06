/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PrintBinaryTree {
    
    private List<List<String>> result;
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
    
    public void recFun(TreeNode root,int rowCount,int totalRows,int start,int end){
        if(rowCount == totalRows)
            return;
        if(root == null)
            return;
        int mid = (start + end)/2;
        result.get(rowCount).set(mid,String.valueOf(root.val));
        recFun(root.left,rowCount + 1,totalRows,start,mid - 1);
        recFun(root.right,rowCount + 1,totalRows,mid + 1,end);
    }
        
        
    public List<List<String>> printTree(TreeNode root) {
        result = new ArrayList<List<String>>();
        if(root == null)
            return result;
        int rows = getHeight(root);
        int columns = (int)Math.pow(2,rows) - 1;
        for(int i = 0 ; i < rows ; i++){
            List<String> temp = new ArrayList<String>();
            for(int j = 0 ; j < columns ; j++)
                temp.add("");
            result.add(temp);
        }
        recFun(root,0,rows,0,columns - 1);
        return result;
    }
}
