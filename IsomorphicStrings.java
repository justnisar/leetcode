public class IsomorphicStrings {
    
    public boolean check(String s,String t){
        HashMap<Character,Character> m = new HashMap<Character,Character>();
        int n = s.length();
        for(int i = 0  ; i < n ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(m.containsKey(ch1) == false)
                m.put(ch1,ch2);
            else{
                char ch = m.get(ch1);
                if(ch != ch2)
                    return false;
            }
        }
        return true;
    }
    public boolean isIsomorphic(String s, String t) {
            
            int m = s.length();
            int n = t.length();
            
            if(m != n)
                return false;
            
            return check(s,t)&&check(t,s);
        
    }
}
