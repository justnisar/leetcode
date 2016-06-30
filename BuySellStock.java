public class BuySellStock {
    public int maxProfit(int[] prices) {
        
        // Length of the array
        int size = prices.length;
        // Base case when there is only day.
        if(size == 1 || size == 0)
            return 0;
            
        // Variables to store the current status
        int min_price_so_far = prices[0];
        int max = 0;
        
        // Iterate over the array
        for(int i = 1 ; i < prices.length ; i++){
            int x = prices[i] - min_price_so_far;
            // If the current day price is lowest among all days seen so far
            if( prices[i] > min_price_so_far && x > max ){
                max = x;   
            }
            if( prices[i] < min_price_so_far){
                min_price_so_far = prices[i];
            }
        }
        return max;
    }
}
