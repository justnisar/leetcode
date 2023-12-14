package archived;

public class SortColors {
    public void sortColors(int[] nums) {
        
        int count[] = new int[3];
        
        int n = nums.length;
        int i = 0;
        for(i = 0 ; i < n ; i++)
            count[nums[i]]++;
            
        int  x = 0;
        
        i = 0;
        
        while(i < 3){
            
            int j = count[i];
            
            while(j-- > 0){
                nums[x] = i;
                x++;
            }
            i++;
            
        }
        
        
    }
}
