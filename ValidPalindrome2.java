class Solution {
  
    public boolean isPalindrome(String str){
      int length = str.length();
      int start = 0;
      int end = length - 1;
      while(start < end){
        if(str.charAt(start) != str.charAt(end))
          return false;
        start++;
        end--;
      }
      return true;
    }
    public boolean validPalindrome(String str) {
        
        int length = str.length();
        int start = 0;
        int end = length - 1;
        int count = 0;
        while(start < end){
          if(str.charAt(start) != str.charAt(end))
            return isPalindrome(str.substring(start+1,end+1)) || isPalindrome(str.substring(start,end));
          start++;
          end--;
        }
        return true;
    }
    /*
    public static void main(String[] args){
      Solution obj = new Solution();
      System.out.println(obj.validPalindrome("abaaaaaaabac"));
    }
    */
}
