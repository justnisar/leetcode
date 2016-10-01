public class Solution {

    

    public void reverse(int[] nums){

        int length = nums.length;

        int i = 0, j = length - 1;

        while(i < j){

            int temp = nums[i];

            nums[i] = nums[j];

            nums[j] = temp;

            i++;

            j--;

        }

    }

    

    public void swap(int[] nums,int i,int j){

        int temp = nums[i];

        nums[i] = nums[j];

        nums[j] = temp;

    }

    

    public void nextPermutation(int[] nums) {

        

        if(nums.length <= 1 )

            return;

        

        int length = nums.length;

        int i = 0;

        

        int min = length - 1;

        for(i = length - 2 ; i >= 0 ;i--){

            if(nums[i] >= nums[min]){

                min = i;

            }

            else{

                break;

            }

        }

        

        if(min == 0){

            reverse(nums);

            return;

        }

        

        int pivot = i;

        

        for(i = length - 1 ; ; i--){

            if(nums[i] > nums[pivot])

                break;

        }

        

        swap(nums,pivot,i);

        

        Arrays.sort(nums,pivot+1,length);

        

        

    }

}
