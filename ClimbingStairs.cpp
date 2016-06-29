class ClimbingStairs {
public:
    int climbStairs(int n) {
        
        int x = 1;
        int y = 2;
        int z;
        if(n <= 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else{
                int i = 3;
                while(i <= n){
                    z = x + y;
                    x = y;
                    y = z;
                    i++;
                }
            }
        
    return z;
        
    }
};
