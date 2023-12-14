class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int size = nums.size();
        int sum = 0;
        for(vector<int>::iterator it = nums.begin() ; it != nums.end() ; it++)
            sum += *it;
            
        return size * (size + 1) / 2 - sum;
        
    }
};
