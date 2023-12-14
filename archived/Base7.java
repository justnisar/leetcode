package archived;

public class Base7 {
    public String convertToBase7(int num) {
    if(num == 0)
      return "0";
    StringBuffer result = new StringBuffer();
    int n = num;
    if(num < 0)
      num = Math.abs(num);
    while(num != 0){
      int reminder = num % 7;
      result.append((char)(reminder + 48));
      num = num/7;
    }
    if(n < 0)
      result.append('-');
    return result.reverse().toString();
  }
}
