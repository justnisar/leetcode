package archived;

public class DetectCapital {
    public boolean isAllLower(String word){
    int length = word.length();   
    if(length == 0)
      return true;
    for(int i = 0 ; i < length ; i++){
      char ch = word.charAt(i);
      if(!(ch >= 97 && ch <= 122))
        return false;
    }
    return true;
  }
  
  public boolean isAllUpper(String word){
    int length = word.length();
    if(length == 0)
      return true;
    for(int i = 0 ; i < length ; i++){
      char ch = word.charAt(i);
      if(!(ch >= 65 && ch <= 90))
        return false;
    }
    return true;
  }
  
  public boolean detectCapitalUse(String word) {
    return isAllUpper(word) || isAllLower(word) || (word.length() > 1 && (word.charAt(0) >= 65 && word.charAt(0) <= 90) && isAllLower(word.substring(1)));
  }
  
}
