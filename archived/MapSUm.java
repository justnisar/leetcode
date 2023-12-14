package archived;

class MapSum {

   /** Initialize your data structure here. */
    private HashMap<String,Integer> hm;
    public MapSum() {
        hm = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        hm.put(key,val);
    }
    
    public int sum(String prefix) {
        int result = 0;
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if(key.startsWith(prefix))
                result += value;
        }
        return result;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
