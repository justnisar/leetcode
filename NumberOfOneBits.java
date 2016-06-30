public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        do{
            int k = n & 1; 
            if(k == 1)
                count++;
            n = n>>>1;
        }while(n != 0);
        
     return count;   
    }
}
