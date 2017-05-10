public class KeyboardRow {
   private HashSet<Character>[] rows;
	
	public Solution(){
		String[] str_rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		rows = new HashSet[3];
		for(int i = 0 ; i < 3 ; i++){
			rows[i] = new HashSet<Character>();
			for(int j = 0 ; j < str_rows[i].length() ; j++)
				rows[i].add(str_rows[i].charAt(j));
		}
	}
	
	public boolean isPresent(String word){
	  int length = word.length();
	  int flag = 0;
	  for(int i = 0 ; i < 3 ; i++){
	      flag = 0;
	    for(int j = 0 ; j < length ; j++){
	      char ch = word.charAt(j);
	      if(!rows[i].contains(ch)){
	        flag = 1;
	        break;
	      }
	    }
	    if(flag == 0)
	      return true;
	    else
	      flag = 0;
	  }
	  return false;
	}
	
	public String[] findWords(String[] words) {
		List<String> result = new ArrayList<String>();
		int length = words.length;
		for(int i = 0 ; i < length ; i++){
			String word = words[i];
			if(isPresent(word.toLowerCase()))
			  result.add(word);
		}
		
		
		return result.toArray(new String[result.size()]);
				
    }
}
