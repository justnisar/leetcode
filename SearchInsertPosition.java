class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0,right = n - 1;
        int mid;
 
        while( left <= right ){
            mid = left + (right - left)/2;
 
            if( nums[mid] == target ) // first comparison
                return mid;
 
            if( nums[mid] < target ) // second comparison
                left = mid + 1;
            else
                right = mid - 1;
    }
 
    return left;
    }
}i
