package archived;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return nums.length;
        int result = 1;
        int i = 1;
        int n = nums.length;
        int prev = nums[0];
        while(i < n){
            
            if(nums[i] == prev){
                int temp = nums[i];
                for(int j = i + 1 ; j < n ; j++){
                    nums[j-1] = nums[j];
                }
                nums[n-1] = temp;
                n--;
            }
            else{
                prev = nums[i];
                i++;
                result++;
            }
            
        }
        return result;
    }
}
