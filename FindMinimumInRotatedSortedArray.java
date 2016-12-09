public class FindMinimumInRotatedSortedArray {
    
    public int getMin(int a,int b){
        if(a < b)
            return a;
        return b;
    }
    
    public int findMin(int[] nums) {
        
        int length = nums.length;
        if(length == 1 ){
            return nums[0];
        }
        
        if(length == 2){
            return getMin(nums[0],nums[1]);
        }
        
        int low = 0, high = length - 1, mid;
        
        while(true){
            
            mid = low + (high - low)/2;
            if(low == high){
                return nums[low];
            }
            else if(high == low + 1){
                return getMin(nums[low],nums[high]);
            }
            else if(nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]){
                return nums[mid];
            }
            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else if(nums[mid] < nums[high]){
                high = mid - 1;
            }
            
            
        }
        
    }
}