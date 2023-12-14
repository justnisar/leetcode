package archived;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if(k < 0)
            return 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int length = nums.length;
        int result = 0;
        for(int i = 0 ; i < length ; i++)
          hm.put(nums[i],hm.getOrDefault(nums[i],0) + 1);
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
          if(k == 0){
              if(entry.getValue() >= 2)
                result++;
            
          }
          else{
              if(hm.containsKey(k + entry.getKey()))
                result++;
          }
          
        }
        return result;
    }
}
