package archived;

public class Solution {

    

    public List<List<Integer>> subsets(int[] nums) {

        

        List< List<Integer> > l_al = new ArrayList< List<Integer> >();

        

        List<Integer> al = new ArrayList<Integer>();

        

        if(nums.length == 0){

            l_al.add(al);

            return l_al;

        }

        

        List<Integer> al1 = new ArrayList<Integer>();

        al1.add(nums[0]);

        l_al.add(al);

        l_al.add(al1);

        

        int length = nums.length;

        

        for(int i = 1 ; i < length ; i++){

            int element = nums[i];

            int n = l_al.size();

            for(int j = 0 ; j < n ; j++){

                List<Integer> l = new ArrayList<Integer>(l_al.get(j));

                l.add(element);

                l_al.add(l);

            }

        }

        

        return l_al;

    }

}
