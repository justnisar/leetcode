package archived;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0 ; i < 32 ; i++){
            int num = n >> i;
            int x = num & 1;
            x = x << (31 - i);
            result = result | x;
        }
            
        return result;
        }
    }
