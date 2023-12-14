package archived;

public class Solution {

    public String largestNumber(int[] nums) {

        

        int length = nums.length;

        String[] str_arr = new String[length];

        for(int i = 0 ; i < length ; i++){

            str_arr[i] = String.valueOf(nums[i]);

        }

        

        

        Arrays.sort(str_arr, new Comparator<String>() {



            @Override

            public int compare(String o1, String o2) {

    	        //return o2.compareTo(o1);

    	        String p = o1 + o2;

    	        String q = o2 + o1;

    	        return q.compareTo(p);

            }

});

  

  String s = "";

  for(int i = 0 ; i < length ; i++){

      s += str_arr[i];

  }

  int i = 0;

  for(i = 0 ; i < s.length() - 1 ; i++){

      if(s.charAt(i) != '0'){

          break;

      }

  }

  

  

  

  return s.substring(i);

        

    }

}
