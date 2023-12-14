package archived;

public class HouseRobber {
    
    int getMax(int x,int y){
        if(x > y)
            return x;
        return y;
    }
    
    public int rob(int[] nums) {
        
        // base cases
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2){
            return getMax(nums[0],nums[1]); 
        }
        
        int size = nums.length;
        int[] array = new int[size];
        
        array[0] = nums[0];
        array[1] = getMax(nums[0],nums[1]);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 2 ; i < size ; i++){
            array[i] = getMax(array[i-1], array[i-2] + nums[i]);
        }
        
        
        return array[size - 1];
    }
}
