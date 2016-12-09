public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        
        int[] array = new int[26];
        
        int length = s.length();
        
        for(int i = 0 ; i < length ; i++){
            char ch = s.charAt(i);
            array[ch - 97]++;
        }
        
        for(int i = 0 ; i < length ; i++){
            char ch = s.charAt(i);
            if(array[ch-97] == 1){
                return i;
            }
        }
        return -1;
        
    }
}