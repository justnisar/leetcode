class Solution {
public:
    
    int titleToNumber(string s) {
        int sum = 0;
        int len = s.length();
        int n = 0;
        for(int i = len - 1 ; i>= 0 ; i--){
            sum = sum + (s[i] - 64) * pow( 26, n);
            n++;
        }
    
        return sum;
    }
};
