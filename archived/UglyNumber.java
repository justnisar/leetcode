package archived;

public class UglyNumber {
    public boolean isUgly(int num) {
        if(num==0) return false;
        if(num==1) return true;
        while(num%2==0) num/=2;
        while(num%3==0) num/=3;
        while(num%5==0) num/=5;
        if(num!=1)
            return false;
        return true;
    }
};
