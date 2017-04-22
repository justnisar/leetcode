/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeAndDeserializeBst {

   int global  =0;
	
	public StringBuffer serialize_util(TreeNode root,StringBuffer str){
		if(root == null){
			str.append("null,");
			return str;
		}
		str.append(root.val);
		str.append(",");
		str = serialize_util(root.left,str);
		str = serialize_util(root.right, str);
		return str;
	}
	
	
	public String serialize(TreeNode root) {
		StringBuffer result = serialize_util(root,new StringBuffer(""));
		result.deleteCharAt(result.length() - 1);
		return result.toString();
    }
	
	public TreeNode deserialize_util(String[] array, int end){
		if(global == end)
			return null;
		String current = array[global];
		if(current.equals("null"))
			return null;
		TreeNode root = new TreeNode(Integer.parseInt(current));
		global++;
		root.left = deserialize_util(array,end);
		global++;
		root.right = deserialize_util(array,end);
		return root;
	}
	
	public TreeNode deserialize(String data) {
        String[] str_arr = data.split(",");
        int length = str_arr.length;
        if(length == 0)
        	return null;

        return deserialize_util(str_arr,length - 1);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
