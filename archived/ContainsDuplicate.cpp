nclude <set>
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> s;
        
        for(vector<int>::iterator it = nums.begin(); it != nums.end(); it++){
            if(s.count(*it) == 0)
                s.insert(*it);
            else
                return true;
        }
        return false;
    }
};
