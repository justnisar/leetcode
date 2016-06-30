public class AddDigits {
    int getsum(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num % 10;
            num = num/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        
        int sum = 0;
        
      while(num != 0){
         int n = getsum(num);
         if(n < 10)
            return n;
        num = n;
          
      }

    return 0;    
    }
}
