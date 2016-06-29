 class MaximumSubarray {
    
    public int max(int a,int b){
        if(a > b)
            return a;
        else
            return b;
    }
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        int max_till_now = nums[0];
        int max_so_far = nums[0];
        
        for(int i = 1 ; i < len ; i++){
            max_till_now = max(nums[i],nums[i] + max_till_now);
            max_so_far = max(max_till_now,max_so_far);
        }
     return max_so_far;   
    }
}
