public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // variables which help to iterate over the 2 arrays
        int i = 0 , j = 0;
        
        while(i < m && j < n){
            
            if(nums1[i] <= nums2[j]){
                i++;
            }
            else{
                int k = m;
                while(k > i){
                    nums1[k] = nums1[k-1];
                    k--;
                }
                m++;
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
        
        if(i == m){
            while(j < n){
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
        
    }
}
