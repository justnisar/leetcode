package archived;

class Solution {
public:
    bool isPowerOfTwo(int n) {
        
        double logar = log2(n);
        if(logar - (int)logar == 0)
            return true;
        return false;
        
    }
};
