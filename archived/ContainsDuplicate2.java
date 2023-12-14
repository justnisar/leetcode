package archived;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mapping = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            if(mapping.containsKey(nums[i])){
                int oldPosition = mapping.get(nums[i]);
                if(i - oldPosition <= k)
                    return true;
            }
            mapping.put(nums[i],i);
        }
        return false;
    }
}
