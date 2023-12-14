package archived;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        

        int length = numbers.length;

        

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        

        int[] result = new int[2];

        

        for(int i = 0 ; i < length ; i++){

            hm.put(numbers[i],i+1);    

        }

        

        for(int i = 0 ; i < length ; i++){

            int check = target - numbers[i];

            if(hm.containsKey(check)){

                result[0] = i + 1;

                result[1] = hm.get(check);

                return result;

            }

        }

        return result;

    }

}
