package archived;/*
This is a recursive solution
public class Solution {
    public double recFun(double x,int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        double temp = recFun(x,n/2);
        if(n % 2 == 0){
            return temp * temp; 
        }
        else{
            return x * temp * temp;
        }
    }
    public double myPow(double x, int n) {
        double result = recFun(x,n);
        if(n < 0)
            return 1/result;
        return result;
    }
}
*/





// This is a trivial solution
public class Solution {

    public double myPow(double x, int n) {

        return Math.pow(x,n);

    }

}
