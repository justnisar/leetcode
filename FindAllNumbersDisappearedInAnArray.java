public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> hs = new HashSet<Integer>();

        int length = nums.length;

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0 ; i < length ; i++)

            hs.add(nums[i]);

        for(int i = 1 ; i <= length ; i++){

            if(!hs.contains(i))

                result.add(i);

        }

        return result;

    }

}
