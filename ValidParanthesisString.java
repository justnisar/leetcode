class Solution {
  
  public boolean check(String s,int start,int end,int count){
    if(count < 0)
      return false;
    for(int i = start ; i <= end ; i++){
      char ch = s.charAt(i);
      if(ch == '('){
        count++;
      }
      else if(ch == ')'){
        count--;
        if(count < 0)
          return false;
      }
      else{
        return check(s,i+1,end,count+1) || check(s,i+1,end,count-1) || check(s,i+1,end,count);
      }
    }
    return count == 0;
  }
  
  public boolean checkValidString(String s) {
    int length = s.length();
    return check(s,0,length-1,0);
  }
    /*
    public static void main(String[] args){
      ValidParanthesis obj = new ValidParanthesis();
      System.out.println(obj.checkValidString("()"));
      System.out.println(obj.checkValidString("(*)"));
      System.out.println(obj.checkValidString("(*)))"));
    }
    */
}
