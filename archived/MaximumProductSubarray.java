package archived;

public class MaximumProductSubarray {
    
    public int maxProduct(int[] nums) {
        int minHerePre = nums[0];
        int maxHerePre = nums[0];
        int maxSoFar = nums[0];
        int maxHere,minHere;
        int length = nums.length;
        for(int i = 1 ; i < length ; i++){
            maxHere = Math.max(Math.max(nums[i] * maxHerePre,nums[i] * minHerePre),nums[i]);
            minHere = Math.min(Math.min(nums[i] * maxHerePre,nums[i] * minHerePre),nums[i]);
            maxSoFar = Math.max(maxHere,maxSoFar);
            maxHerePre = maxHere;
            minHerePre = minHere;
        }
        return maxSoFar;
    }
}
