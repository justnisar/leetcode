package archived;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;
        
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i = 0 ; i < n ; i++){
            if(h.contains(nums[i]) != true)
                h.add(nums[i]);
            else
                h.remove(nums[i]);
        }
        
        Object o[] = h.toArray();
        int x[] = new int[2];
        x[0] = Integer.parseInt(o[0].toString());
        x[1] = Integer.parseInt(o[1].toString());
        
        return x;
    }
}
