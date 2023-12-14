package archived;

public class SortCharactersByFrequency {
    
    public String frequencySort(String s) {
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int length = s.length();
		int max = 0;
		int value;
		for(int i = 0 ; i < length ; i++){
			char ch = s.charAt(i);
			if(!map.containsKey(ch)){
				value = 1;
			}
			else{
				value = map.get(ch);
				value++;
			}
			map.put(ch, value);
			max = Math.max(max,value);
		}
		List<Character>[] array = new List[max + 1];
		for(int i = 0 ; i < max + 1 ; i++)
			array[i] = new ArrayList();
		for(Character ch : map.keySet()){
			value = map.get(ch);
			array[value].add(ch);
		}
		
		StringBuffer result = new StringBuffer();
		for(int i = max ; i >= 0 ; i--){
			if(array[i] != null)
				for(Character ch : array[i]){
					int j = i;
					while(j-- > 0)
						result.append(ch);
				}
		}
		return result.toString();
    }

    
}
