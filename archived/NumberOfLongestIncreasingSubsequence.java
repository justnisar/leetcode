package archived;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        int[] len = new int[length];
        int[] cnt = new int[length];
        int max = 0, res = 0;
        for(int i = 0 ; i < length ; i++){
            len[i] = cnt[i] = 1;
            for(int j = 0 ; j < i ; j++){
                if(nums[i] > nums[j]){
                    if(len[j] + 1 > len[i]){
                        len[i] = len[j] + 1;
                        cnt[i] = cnt[j];
                    }
                    else if(len[j] + 1 == len[i])
                        cnt[i] += cnt[j];
                }
            }
            if(len[i] > max){
                max = len[i];
                res = cnt[i];
            }
            else if(len[i] == max)
                res += cnt[i];
        }
        return res;
    }
}
