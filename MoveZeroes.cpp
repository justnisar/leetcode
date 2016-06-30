class Solution {
public:

    
    void moveZeroes(vector<int>& nums) {
        
        int pivotindex = 0;
        int len = nums.size();
        for( int i = 0; i < len; i++){
            if( nums[i] != 0  ){
                if(pivotindex != i){
                nums[pivotindex] = nums[pivotindex] + nums[i];
                nums[i] = nums[pivotindex] - nums[i];
                nums[pivotindex] = nums[pivotindex] - nums[i];
                }
                pivotindex++;
                
                
            }
            
            
        }
        
    }
};
