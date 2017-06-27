public class GroupAnagrams {
    
    public String getUnique(String str){
    char[] ch_arr = new char[26];
    for(int i = 0 ; i < str.length() ; i++){
      char ch = str.charAt(i);
      ch_arr[ch - 'a']++;
    }
    return new String(ch_arr);
  }
  
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
    
    HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
    
    for(String str : strs){
      String key = getUnique(str);
      if(map.containsKey(key)){
        map.get(key).add(str);
      }
      else{
        ArrayList<String> valueList = new ArrayList<String>();
        valueList.add(str);
        map.put(key, valueList);
      }
    }
    result.addAll(map.values());
    return result;
    }
}
