class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int size = nums.size();
        int i;
        int sum = 0;
        for(i =0 ;i < size; i++)
        sum ^= nums[i];
        return sum;
        
    }
};
