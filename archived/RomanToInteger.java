package archived;

public class RomanToInteger {
    
    HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        
        public Solution(){
            m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        }
    /*
    public int getNegative(int x){
        return -x;
    }
    */
    
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if( m.get( s.charAt(i) ) >= m.get( s.charAt(i+1) ) ){
                result += m.get( s.charAt(i) );
            }
            else{
                result -= m.get( s.charAt(i) );
            }
        }
        return result + m.get(s.charAt(s.length() - 1));
    }
}
