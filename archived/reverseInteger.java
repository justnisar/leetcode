package archived;

public class Solution {
    public int reverse(int x) {
        
        
        
        int flag = 0;
        
        if(x < 0){
            flag = 1;
            x = 0 - x;
        }
        
        String s = String.valueOf(x);
        
        //StringBuffer sb = new StringBuffer(s);
        
        int size = s.length();
        
        int y = 0 , z = 0;
        for(int i = 0 ; i < size ; i++){
            y += (s.charAt(i) - 48) * Math.pow(10,z);
            z = z + 1;
        }
        
        if(y >= 2147483647)
            return 0;
        
        if(flag == 0)
            return y;
        else
            return -y;
        
    }
}
