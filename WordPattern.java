public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        // 2 hashmaps to check for the membership
        HashMap<Character,String> map1 = new HashMap<Character,String>();
        HashMap<String,Character> map2 = new HashMap<String,Character>();
        
        // length of the string
        int length1 = pattern.length();
        String[] words = str.split(" ");
        int length2 = words.length;
        
        if(length1 != length2)
            return false;
        
        for(int i = 0 ; i < length1 ; i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(!map1.containsKey(ch)){
                map1.put(ch,word);    
            }
            else{
                String value = map1.get(ch);
                if(!value.equals(word))
                    return false;
            }
            if(!map2.containsKey(word)){
                map2.put(word,ch);
            }
            else{
                char val = map2.get(word);
                if(val != ch)
                    return false;
            }
        }
        
        return true;
       
    }
}
