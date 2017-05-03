public class LongestAbsoluteFilePath {
    public int getLevel(String str){
		return str.length() - str.replaceAll("\t", "").length();
	}
	
	public int getLengthWithoutTabs(String str){
		return str.replaceAll("\t","").length();
	}
	
	public int lengthLongestPath(String input) {
		int max = 0;
		int len = 0;
		int currentLength = 0;
		int level = 0;
		String[] tokens = input.split("\n");
		int length = tokens.length;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < length ; i++){
			String str = tokens[i];
			level = getLevel(str);
			while(stack.size() > level)
				currentLength -= stack.pop();
			len = getLengthWithoutTabs(str);
			currentLength += len + 1;
			
			if(str.contains("."))
				max = currentLength - 1 > max ? currentLength - 1 : max;
			
				stack.push(len + 1);
		}
		
		
		return max;
    }
}
