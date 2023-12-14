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
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if(t == null)
      return "";
    String result = t.val + "";
    String leftString = tree2str(t.left);
    String rightString = tree2str(t.right);
    if(leftString == "" && rightString == "")
      return result;
    if(leftString == "")
      return result + "()" + "(" + rightString + ")";
    if(rightString == "")
      return result + "(" + leftString + ")";
    return result + "(" + leftString + ")" + "(" + rightString + ")";
    }
}
