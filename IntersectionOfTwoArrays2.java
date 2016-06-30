public class IntersectionOfTwoArrays2 {
    
    // global ArrayList to add the result to
    ArrayList<Integer> al = new ArrayList<Integer>();
    
    // To get the minimum of 2 numbers
    public int getMin(int x, int y){
        if( x < y)
            return x;
            return y;
    }
    
    // Method to add to the result
    public void addToArrayList(int key,int n){
        for(int i = 0 ; i < n ; i++){
            al.add(key);
        }
    }
    
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // Hash maps for storing the array values
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
        
        
        
        // Store the count of each number in first array
        for(int i = 0 ; i < nums1.length ; i++){
            if( hm1.containsKey(nums1[i]) ){
                //hm1[nums1[i]]++;
                hm1.put(nums1[i],hm1.get(nums1[i]) + 1);
            } 
            else{
                //hm1[nums1[i]] = 1;
                hm1.put(nums1[i],1);
            }
        }
        
        // Store the count of each number in second array
        for(int i = 0 ; i < nums2.length ; i++){
            if( hm2.containsKey(nums2[i]) ){
                //hm2[nums2[i]]++;
                hm2.put(nums2[i],hm2.get(nums2[i]) + 1);
            } 
            else{
                //hm2[nums2[i]] = 1;
                hm2.put(nums2[i],1);
            }
        }
        
        // Iterate the map
        Iterator it = hm2.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        //System.out.println(pair.getKey() + " = " + pair.getValue());
        if( hm1.containsKey(pair.getKey())){
            int min = getMin(hm1.get(pair.getKey()),hm2.get(pair.getKey()));
            addToArrayList((int)pair.getKey(),min);
        }
        it.remove(); // avoids a ConcurrentModificationException
        }
        int array[] = new int[al.size()];
        for(int i = 0 ; i < al.size() ; i++){
            array[i] = al.get(i);
        }
        return array;
    }

    }

