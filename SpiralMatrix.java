public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> ll = new ArrayList<Integer>();
     int m = matrix.length;
     int n;
     if(m != 0)
        n = matrix[0].length;
     else 
        n = 0;
     int i = 0;
     int k = 0;
     int l = 0;
    
     while(k < m && l < n){
         
         for(i = l ; i < n ; i++)
            ll.add(matrix[k][i]);
         k++;
         
         for(i = k ; i < m ; i++)
            ll.add(matrix[i][n-1]);
         n--;
      
         if(k < m){   
         for(i = n - 1; i >= l; i--)
            ll.add(matrix[m-1][i]);
         m--;
         }
         if(l < n){
         for(i = m - 1; i >= k ; i--)
            ll.add(matrix[i][l]);
         l++;
         }
     }
        
     return ll;
    }
}
