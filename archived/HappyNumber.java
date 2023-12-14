package archived;

public class HappyNumber {
    
    public int getsumsquaredigits(int n){
        int sum = 0;
        while(n != 0){
            int d = n % 10;
            sum += Math.pow(d,2);
            n = n/10;
        }
     return sum;   
    }
    
    
    public boolean isHappy(int n) {
        
        HashSet<Integer> h = new HashSet<Integer>();
        
        
        while(true){
            
            n = getsumsquaredigits(n);
            if(h.contains(n))
                break;
            if (n == 1)
                return true;
            h.add(n);
            
        }
        
        return false;
    }
}
