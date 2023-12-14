package archived;

public class IntegerToWords {
  private HashMap<Integer,String> thousandsMap;
  private HashMap<Integer,String> hundredsMap;
  private HashMap<Integer,String> onesMap;
  
  
  public IntegerToWords(){
    
    thousandsMap = new HashMap<Integer,String>();
    hundredsMap = new HashMap<Integer,String>();
    onesMap = new HashMap<Integer,String>();
    
    // Thousands Map
    thousandsMap.put(0,"");
    thousandsMap.put(1,"Thousand");
    thousandsMap.put(2,"Million");
    thousandsMap.put(3,"Billion");
    
    // Hundreds Map
    hundredsMap.put(0,"");
    hundredsMap.put(1,"Ten");
    hundredsMap.put(2,"Twenty");
    hundredsMap.put(3,"Thirty");
    hundredsMap.put(4,"Forty");
    hundredsMap.put(5,"Fifty");
    hundredsMap.put(6,"Sixty");
    hundredsMap.put(7,"Seventy");
    hundredsMap.put(8,"Eighty");
    hundredsMap.put(9,"Ninety");
    
    // Ones Map
    onesMap.put(0, "");
    onesMap.put(1, "One");
    onesMap.put(2, "Two");
    onesMap.put(3, "Three");
    onesMap.put(4, "Four");
    onesMap.put(5, "Five");
    onesMap.put(6, "Six");
    onesMap.put(7, "Seven");
    onesMap.put(8, "Eight");
    onesMap.put(9, "Nine");
    onesMap.put(10, "Ten");
    onesMap.put(11, "Eleven");
    onesMap.put(12, "Twelve");
    onesMap.put(13, "Thirteen");
    onesMap.put(14, "Fourteen");
    onesMap.put(15, "Fifteen");
    onesMap.put(16, "Sixteen");
    onesMap.put(17, "Seventeen");
    onesMap.put(18, "Eighteen");
    onesMap.put(19, "Nineteen");
  }
  
  public String recFun(int number){
    if(number == 0)
        return "";
    else if(number < 20)
      return onesMap.get(number) + " ";
    else if(number < 100)
      return hundredsMap.get(number/10) + " " + recFun(number % 10);
    else
      return onesMap.get(number/100) + " " + "Hundred" + " " + recFun(number%100);
  }
  
  public String numberToWords(int number) {
    if(number == 0)
      return "Zero";
    int level = 0;
    String result = "";
    while(number != 0){
      if(number % 1000 != 0)
        result = recFun(number % 1000) + thousandsMap.get(level) + " " + result;
        number /= 1000;
      level++;
    }
  return result.trim();
  }
  
}
