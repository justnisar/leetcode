package archived;

public class EditDistance {
    
    public int min(int x, int y){
        if(x < y)
        return x;
        else
        return y;
    }
    public int min(int x, int y, int z){
        
        if(x < min(y,z) )
        return x;
        else
        return min(y,z);
        
    }
    
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int i,j;
        int a[][]  = new int [m+1][n+1];
        for(i = 0 ; i < m+1; i++){
            for(j = 0 ; j< n+1 ; j++)
            a[i][j] = 0;
        }
        for(i = 0 ; i < m+1 ; i++)
        a[i][0] = i;
        for(j = 0 ; j < n+1 ; j++)
        a[0][j] = j;
        
        for(i = 1 ; i < m+1 ; i++){
            for(j = 1 ; j < n+1 ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                a[i][j] = a[i-1][j-1];
                else
                a[i][j] = 1 + min(a[i-1][j],a[i][j-1],a[i-1][j-1]);
            }
        }
        
        
        return a[m][n];
    }
}
