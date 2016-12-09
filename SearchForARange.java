public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        
        int index = Arrays.binarySearch(nums,target);
        
        int start,end;
        
        int length = nums.length;
        
        int[] result = new int[2];
        
        if(index == length || index < 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        /*    
        start = Arrays.binarySearch(nums,0,index,target);
        
        if(start < 0 || start == index){
            result[0] = index;
        }
        else{
            while(){
            start = Arrays.binarySearch(nums,0,index);
        }    
        }
        
        */
        
        start = index;
        while(start >= 0 && nums[start] == target){
            start--;
        }
        start++;
        
        end = index;
        while(end < length && nums[end] == target){
            end++;
        }
        end--;
        
        result[0] = start;
        result[1] = end;
        return result;
    }
}