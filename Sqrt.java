
// Method to find out the square root
public class Solution {
    public int mySqrt(int x) {
        long i = 0;
        for(i = 0 ; i * i <= x ; i++)
            ;
        return (int)i - 1;
    }
}
