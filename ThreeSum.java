public class ThreeSum {
    	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer> > result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
		int length = nums.length;
		int i,j,k;
		for(i = 0 ; i < length - 2 ; i++){
			j = i + 1;
			k = length - 1;
			while(j < k){
				int number = nums[i] + nums[j] + nums[k];
				if(number == 0){
					List<Integer> al = new ArrayList<Integer>();
					al.add(nums[i]);
					al.add(nums[j]);
					al.add(nums[k]);
					Collections.sort(al);
					if(!hs.contains(al)){
						hs.add(al);
						result.add(al);
					}
					j++;
					k--;
					while(j < k && nums[j] == nums[j-1])
						j++;
					while(j < k && nums[k] == nums[k+1])
						k--;
				}
				else if(number < 0){
					j++;
				}
				else{
					k--;
				}
			}
		}
		
		
		
		return result;
    }
}