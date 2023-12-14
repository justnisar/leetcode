package archived;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        
        int len = nums.length;
        
        int count = 1;
        int maj_index = 0;
        
        for(int i = 1 ; i < len ; i++){
            if(nums[i] == nums[maj_index])
                count++;
            else if(nums[i] != nums[maj_index] && count > 0)
                count--;
            else{
                count = 1;
                maj_index = i;
            }
        }
        return nums[maj_index];
        
    }
}
