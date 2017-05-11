public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int x = (int)Math.floor(Math.sqrt(2) * Math.sqrt(n));
   if(((long)x * (x+1))/2 > n)
     return x - 1;
   return x;
    }
}
