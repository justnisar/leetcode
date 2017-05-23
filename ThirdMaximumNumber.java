public class ThirdMaximumInteger {
    public int thirdMax(int[] nums) {
            Integer max1 = null,max2 = null,max3 = null;
    int length = nums.length;
    
    for(Integer number : nums){
      if(number.equals(max1) || number.equals(max2) || number.equals(max3))
        continue;
      else if(max1 == null || number > max1){
        max3 = max2;
        max2 = max1;
        max1 = number;
      }
      else if(max2 == null || number > max2){
        max3 = max2;
        max2 = number;
      }
      else if(max3 == null || number > max3){
        max3 = number;
      }
        
    }
    
    return max3 == null ? max1.intValue() : max3.intValue(); 
    }
}
