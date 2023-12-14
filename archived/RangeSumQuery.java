package archived;

public class RangeSumQuery {
    int array[];
    public NumArray(int[] nums) {
           array = new int[nums.length];
           int sum = 0;
           for(int i = 0 ; i < nums.length ; i++){
               sum += nums[i];
               array[i] = sum;
           }
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return array[j];
        else 
            return array[j] - array[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
