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
public class DeleteNodeInABst {
    
    public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null)
			return root;
		else if(key < root.val)
			root.left = deleteNode(root.left,key);
		else if(key > root.val)
			root.right = deleteNode(root.right,key);
		//This is the node to be deleted
		else{
			//Case 1 : When there is no left subtree
			if(root.left == null)
				root = root.right;
			//case 2 : When there is no right subtree
			else if(root.right == null)
				root = root.left;
			//case 3 : When the node to be deleted is a leaf node
			else if(root.left == null && root.right == null)
				root = null;
			//case 4 : When there is both the left and right subtree			else{
				TreeNode current = root.right;
				while(current.left != null)
					current = current.left;
				root.val = current.val;
				//current = null;
				root.right = deleteNode(root.right,current.val);
			}
		}
		return root;
	}
}
