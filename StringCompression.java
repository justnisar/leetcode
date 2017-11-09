class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        if(length <= 1)
            return length;
        String result = "";
        int count = 0;
        char prev = chars[0];
        for(int i = 1 ; i < length ; i++){
            char current = chars[i];
            if(current == prev)
                count++;
            else{
                result += prev;
                if(count != 0)
                    result += String.valueOf(count + 1);
                prev = current;
                count = 0;
            }
        }
        result += prev;
        if(count != 0)
            result += String.valueOf(count + 1);
        
        for(int i = 0 ; i < result.length() ; i++)
            chars[i] = result.charAt(i);
        return result.length();
    }
}

