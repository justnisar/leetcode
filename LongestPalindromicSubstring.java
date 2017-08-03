public class Solution {
      public String longestPalindrome(String s) {
    // base cases
    int n = s.length();
    if(n == 0)
        return "";
    if(n == 1)
        return s;
    else if(n == 2 && s.charAt(0) == s.charAt(1))
      return s;
    else if(n == 2)
      return s.substring(0,1);
    
    boolean[][] array = new boolean[n][n];
    int max = 1;
    int start = 0,end = 0;
    int i,j,k;
    for(i = 0 ; i < n ; i++)
        array[i][i] = true;
    
    for(i = 0; i < n - 1 ; i++){
        if(s.charAt(i) == s.charAt(i+1)){
            array[i][i+1] = true;
            start = i;
            end = i + 1;
        }
    }
    
    for(k = 2 ; k < n ; k++){
        for(i = 0 ; i < n - k ; i++){
            j = i + k;
            if(array[i+1][j-1] == true && s.charAt(i) == s.charAt(j)){
                
                array[i][j] = true;
                start = i;
                end = i+k;
            } 
        }
    }
    
    return s.substring(start,end+1);

    
}
}
