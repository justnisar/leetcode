package archived;

public class ReverseVowelsOfString {
    
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            return true;
            return false;
    }
    
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0;
        int j = c.length - 1;
        while(true){
            
            while(i < n && !isVowel(c[i]) )
                ++i;
            while(j >= 0 && !isVowel(c[j]) )
                --j;
            
            if(i >= j)
                break;
                
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            ++i;
            --j;
        }
        return new String(c);
    }
    
}
