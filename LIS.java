 class LIS {
    public int lengthOfLIS(int[] nums) {
        
        
        int len = nums.length;
        if(len == 0)
            return 0;
        int lis[] = new int[len];
        
        for(int i = 0; i < len ; i++)
        lis[i] = 1;
            
        for(int i = 1; i < len ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < i ; j++){
                if(nums[i] > nums[j]){
                    if(1 + lis[j] > max)
                        max = 1 + lis[j];
            }
        }
        if(max != Integer.MIN_VALUE)
        lis[i] = max;   
    }
    
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < len; i++){
        if(lis[i] > max)
            max = lis[i];
    }
    return max;
}
}
