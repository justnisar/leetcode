public class ShuffleAnArray {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null)
        	return null;
        
        int[] result = nums.clone();
        int length = nums.length;
        Random rand = new Random();
        for(int i = 1 ; i < length ; i++){
        	
        	int j = rand.nextInt(i + 1);
        	swap(result,i,j);
        }
        return result;
    }
    	
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
