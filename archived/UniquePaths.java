package archived;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int [][]a = new int[m][n];
        int i=0,j=0;
        for(i = 0 ; i < m ; i++)
            a[i][0] = 1;
        for(i = 0 ; i < n ; i++)
            a[0][i] = 1;
        
        for(i = 1 ; i < m ; i++){
            for(j = 1; j < n ;j++){
                a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        
        return a[m-1][n-1];
    }
}
