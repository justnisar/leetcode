package archived;

class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int length = nums.length;
        if(length <= 1)
            return length;
        int[] dp = new int[length];
        dp[0] = 1;
        int max = 1;
        for(int i = 1 ; i < length ; i++){
            if(nums[i] > nums[i-1]){
                dp[i] = dp[i-1] + 1;
                if(dp[i] > max)
                    max = dp[i];
            }
            else{
                dp[i] = 1;
            }
        }
        return max;
    }
}
