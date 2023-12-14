package archived;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        
        int matrix[][] = new int[n][n];
            
        int i = 0;
        int k = 0;
        int l = 0;
        int m = n;
        //int limit = n * n;
        
        int count = 1;
            
        
        while(k < m && l < n){
         
         for(i = l ; i < n ; i++){
             matrix[k][i] = count;
             ++count;
         }
         k++;
         
         for(i = k ; i < m ; i++){
            matrix[i][n-1] = count;
            ++count;
         }
         n--;
      
         if(k < m){   
         for(i = n - 1; i >= l; i--){
            matrix[m-1][i] = count;
            ++count;
         }
         m--;
         }
         if(l < n){
         for(i = m - 1; i >= k ; i--){
            matrix[i][l] = count;
            ++count;
         }
         l++;
         }
        }
        
    
          return matrix;
    }
}
