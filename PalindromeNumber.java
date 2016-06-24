public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        
        int i = 0, j = s.length() - 1;
        
        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2)
                return false;
            i++;
            j--;
        }
        return true;
        
    }
}
