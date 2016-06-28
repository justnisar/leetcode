class StrStr {
    public int strStr(String haystack, String needle) {
        
        if(haystack.equals(needle))
            return 0;
        if(needle.equals(""))
            return 0;
        
        int source_length = haystack.length();
        int target_length = needle.length();
        
        for(int i = 0 ; i < source_length - target_length + 1; i++){
            String s = haystack.substring(i,i + target_length);
            if(s.equals(needle))
                return i;
        }
        return -1;
    }
}
