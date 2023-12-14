package archived;

public class WaterAndJugProblem {
    
    int gcd(int x,int y){
        while(x != 0 && y != 0){
            if(x > y)
                x = x % y;
            else 
                y = y % x;
        }
        if(x == 0)
            return y;
        if(y == 0)
            return x;
        return 0;
    }
    
    public boolean canMeasureWater(int x, int y, int z) {
        if(z == 0)
            return true;
        if(x + y < z)
            return false;
        int temp = gcd(x,y);
        System.out.println(temp);
        if(temp == 0)
            return false;
        
        return z%temp == 0;
    }
}