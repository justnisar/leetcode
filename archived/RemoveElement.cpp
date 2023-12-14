class RemoveElement {
public:
    int removeElement(vector<int>& nums, int val) {
        int count = 0;
        vector<int> v1;      
        for( vector<int>::iterator it = nums.begin() ; it != nums.end(); it++){
            if(*it == val)
            v1.push_back(count);
            count++;
        }
        
        count = 0;
        for(vector<int>::iterator it = v1.begin() ; it != v1.end() ;it++ ){
            nums.erase(nums.begin() + (*it - count));
            count++;
        }
        
        return nums.size();
    }
};
