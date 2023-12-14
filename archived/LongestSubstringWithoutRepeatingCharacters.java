package archived;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
		
		// Base case
		int length = s.length();
		if(length <= 1)
			return length;
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int max = 0;
		int currentMax = 0;
		int last = 0;
		for(int i = 0 ; i < length ;i++){
			
			char ch = s.charAt(i);
			if(hm.containsKey(ch)){
				last = Math.max(last, hm.get(ch) + 1);
			}
			currentMax = i - last + 1;
			hm.put(ch,i);
			max = currentMax > max ? currentMax : max;
		}
		return max;
    }
}
