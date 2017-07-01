public class IntegerToRoman {
  
  private  int[] romanRegularValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
  private String[] romanRegularKeys = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
  
  public String recFun(int number){
    if(number == 1)
      return "I";
    if(number == 0)
      return "";
    for(int i = 0 ; i < 13 ; i++){
      if(romanRegularValues[i] > number){
        continue;
      }
      else{
        return romanRegularKeys[i] + recFun(number - romanRegularValues[i]);
           //if(romanRegularValues[i] <= number && number/romanRegularValues[i] < 4){
      }
      
      
    }
    return "";
  }
  
  
  public String intToRoman(int num) {
    return recFun(num);
  }
}
