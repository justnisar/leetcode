public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < nums1.length ; i++){
            hs.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if(hs.contains(nums2[i])){
                al.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        int[] array = new int[al.size()];
        //array = al.toArray(array);
        for(int i = 0 ; i < al.size() ; i++){
            array[i] = al.get(i);
        }
        return array;
    }
}
