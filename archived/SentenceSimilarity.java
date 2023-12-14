package archived;

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        
        int length1 = words1.length;
        int length2 = words2.length;
        if(length1 != length2)
            return false;
        
        HashMap<String,HashSet<String>> map = new HashMap<String,HashSet<String>>();
        for(int i = 0 ; i < pairs.length ; i++){
            String left = pairs[i][0];
            String right = pairs[i][1];
            HashSet<String> temp;
            if(map.containsKey(left)){
                temp = map.get(left);
                temp.add(right);
                map.put(left,temp);
            }
            else{
                temp = new HashSet<String>();
                temp.add(right);
                map.put(left,temp);
            }
            if(map.containsKey(right)){
                temp = map.get(right);
                temp.add(left);
                map.put(right,temp);
            }
            else{
                temp = new HashSet<String>();
                temp.add(left);
                map.put(right,temp);
            }
            

        }
        for(int i = 0 ; i < words1.length ; i++){
            String left = words1[i];
            String right = words2[i];
            if(left.equals(right))
                continue;
            else if((map.get(left) != null && map.get(left).contains(right)) || (map.get(right) != null && map.get(right).contains(left)))
                continue;
            else
                return false;
        }
        
        return true;
    }
}
