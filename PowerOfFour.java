public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        
        if(num == 0){
            return false;
        }
        
        // Variables for count of number of '1' bits and position of the 1 bit
        int count = 0;
        int position = 0;
        int n = num;
        while(n != 0){
            
            int lsb = n & 1;
            if(lsb == 1){
                count++;
            }
            n = n >> 1;
            if(count > 1)
                return false;
            
        }
        
        n = num;
        
        while(n != 0){
            int lsb = n & 1;
            if(lsb == 1 && position % 2 == 0){
                return true;
            }
            if(lsb == 1 && position % 2 != 0){
                return false;
            }
            position++;
            n = n >> 1;
        }
        
        return true;
    }
}
