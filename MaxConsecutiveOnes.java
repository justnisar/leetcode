public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

     

        int length = nums.length;

        int max = Integer.MIN_VALUE;

        int count = 0;

        for(int i = 0 ; i < length ; i++){

            if(nums[i] == 1){

                count++;

                if(count > max)

                    max = count;

            }

            else{

                count = 0;

            }

        }

     if(max == Integer.MIN_VALUE)

        return 0;

     return max;

        

    }

}
