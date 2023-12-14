package archived;

public class LetterCombinationsOfAPhoneNumber {
      public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<String>();
    int length = digits.length();
    if(length == 0)
      return result;
    String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    for(int i = 0 ; i < digits.length() ; i++){
      char ch = digits.charAt(i);
      if( !(ch >= '2' && ch <= '9'))
        return result;
    }
    List<String> temp = new ArrayList<String>();
    result.add("");
    for(int i = length - 1 ; i >= 0 ; i--){
      
      String str = mapping[digits.charAt(i) - '0'];
      
      for(int j = 0 ; j < str.length();j++){
        char ch = str.charAt(j);
        for(String s : result){
           temp.add(ch + s);
        }
      }
      result = new ArrayList<String>(temp);
      temp.clear();
      
    }
    
    
    return result;
}
}
