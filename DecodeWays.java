public class DecodeWays {
    public int numDecodings(String s) {
        
        if(s.equals(""))
            return 0;
        
        int length = s.length();
        
        //case 1 : When the first character is '0'
        if(s.charAt(0) == '0')
            return 0;
        //case 2 : When there is only one character
        if(length == 1 && s.charAt(0) != '0')
            return 1;
    
        //Table to store number of ways to decode like Dynamic programming
        int table[] = new int[length + 1];
        table[0] = 1;
        table[1] = 1;
        for(int i = 2 ; i < length + 1 ; i++){
            // i-1 is the current character and i-2 is the previous character
            char current = s.charAt(i-1);
            char prev    = s.charAt(i-2);
            
            int number = (prev - 48)*10 + (current - 48);
            
            if(current == '0' && prev == '0')
                return 0;
            else if(current == '0' && number <= 26)
                table[i] = table[i-2];
            else if(current != '0' && prev == '0')
                table[i] = table[i-1];
            else if(current != '0' && number <= 26)
                table[i] = table[i-1] + table[i-2];
            else if(current != '0' && number > 26)
                table[i] = table[i-1];
                
            
            
            
        }
        return table[length];
        
        
    }
}
