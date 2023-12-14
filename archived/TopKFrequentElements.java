package archived;

import java.util.Map.Entry;
import java.util.*;
public class TopKFrequentElements{
    public List<Integer> topKFrequent(int[] nums, int k) {
     
        
        int i = 0;
        // HashMap to hold the count of occurances of each number in the array
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        // Iterate over the array and store the count of occurances of each number in the array
        int size = nums.length;
        for(i = 0 ; i < size; i++){
            // If the number is already in the map
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            // If the number is not already in the map
            else{
                map.put(nums[i],1);
            }
        }
        
       Set<Entry<Integer,Integer>> mapEntries = map.entrySet();
       
       List<Entry<Integer,Integer>> aList = new LinkedList<Entry<Integer,Integer>>(mapEntries);
       
       Collections.sort(aList, new Comparator<Entry<Integer,Integer>>() {


            @Override

            public int compare(Entry<Integer, Integer> ele1,

                    Entry<Integer, Integer> ele2) {

               

                return ele2.getValue().compareTo(ele1.getValue());

            }

        });
        
        Map<Integer,Integer> aMap2 = new LinkedHashMap<Integer, Integer>();
        for(Entry<Integer,Integer> entry: aList) {
            aMap2.put(entry.getKey(), entry.getValue());
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        Iterator it = aMap2.entrySet().iterator();
        i = 0;
    while (it.hasNext()) {
        if(i == k)
            break;
        Map.Entry pair = (Map.Entry)it.next();
        //System.out.println(pair.getKey() + " = " + pair.getValue());
        list.add((Integer)pair.getKey());
        it.remove(); // avoids a ConcurrentModificationException
        i++;
    }
        return list;
    }
}
