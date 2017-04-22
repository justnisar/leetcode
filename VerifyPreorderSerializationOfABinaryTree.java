public class VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        String[] preorder_arr = preorder.split(",");
		int length = preorder_arr.length;
		if(length == 0)
			return true;
		Stack<String> stack = new Stack<String>();
		for(int i = 0 ; i < length ; i++){
			String current = preorder_arr[i];
			stack.push(current);
			while(stack.size() >= 3 && stack.get(stack.size() - 1).equals("#")
					&& stack.get(stack.size() - 2).equals("#") && !stack.get(stack.size() - 3).equals("#")){
				stack.pop();
				stack.pop();
				stack.pop();
				stack.push("#");
			}
		}
		
		if(stack.size() == 1 && stack.peek().equals("#"))
			return true;
		
		return false;
    }
}
