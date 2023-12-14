package archived;

public class Permutations {
   
    List<List<Integer>> l; 
   
    
    public void recfun(int[] nums, int a, int b){
        if(a == b){
            List<Integer> ll = new ArrayList<Integer>();
            for(int i = 0 ; i < nums.length ; i++)
                ll.add(nums[i]);    
            l.add(ll);
            return;
        }
        for(int i = a ; i <= b ; i++){
            int t;
            t = nums[a];
            nums[a] = nums[i];
            nums[i] = t;
            recfun(nums,a+1,b);
            t = nums[a];
            nums[a] = nums[i];
            nums[i] = t;
        }    
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        l = new ArrayList<List<Integer>>();
        recfun(nums,0,n-1);
        return l;
    }
}
