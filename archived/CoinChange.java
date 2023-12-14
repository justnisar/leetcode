package archived;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int a[] = new int[amount+1];
        a[0] = 0;
        int m = coins.length;
        int i;
        for(i = 1 ; i < amount + 1 ; i++)
            a[i] = Integer.MAX_VALUE;
        for(i = 1 ; i < amount + 1 ; i++){
            for(int j = 0; j < m ; j++){
                if(i - coins[j] >= 0){
                int x = a[i - coins[j] ];
                if(x != Integer.MAX_VALUE && 1 + x < a[i])
                    a[i] = 1 + x;
                }
            }
        }
     if(a[amount] == Integer.MAX_VALUE)
     return -1;
     return a[amount];   
    }
}
