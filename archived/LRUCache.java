package archived;

public class LRUCache {

    private LinkedHashMap<Integer,Integer> map;
	private int capacity;
	
	public LRUCache(final int capacity){
		this.capacity = capacity;
		map = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
			protected boolean removeEldestEntry(Map.Entry eldest) {
		        return size() > capacity;
		     }
		};
	}
	
	public int get(int key) {
		if(!map.containsKey(key))
			return -1;
		return map.get(key);
    }
    
	
	
    public void put(int key, int value) {
    	map.put(key, value);
    }

}
