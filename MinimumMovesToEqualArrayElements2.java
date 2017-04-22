public class MinimumMovesToEqualArrayElements {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0, j = n - 1, result = 0;
        while(i < j){
            result += nums[j] - nums[i];
            i++;
            j--;
        }
        return result;
    }
}
