package archived;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        

        int length = nums.length;

        HashSet<Integer> hs = new HashSet<Integer>();

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < length ; i++){

            if(!hs.contains(nums[i])){

                hs.add(nums[i]);

            }

            else{

                result.add(nums[i]);

            }

        }

        return result;

        

    }

}
