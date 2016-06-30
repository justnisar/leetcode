public class MaximalSquare {
    public int min(int a,int b){
        if(a < b)
            return a;
        else
            return b;
    }
    
    public int min(int a,int b,int c){
        if(a < b)
            return min(a,c);
        else
            return min(b,c);
    }
    
    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        if(m == 0)
            return 0;
        int n = matrix[0].length;
        
        int i,j;
        
        int [][]a = new int[m][n];
        
        for(i = 0; i < m ; i++){
            for(j = 0 ; j < n ; j++){
                a[i][j] = 0;
            }
        }
        int max = Integer.MIN_VALUE;
        
        for(i = 0; i < m ; i++){
            if(matrix[i][0] == '0')
                a[i][0] = 0;
            else
                a[i][0] = 1;
            if(a[i][0] > max)
                    max = a[i][0];
        }
        
        for(i = 0; i < n ; i++){
            if(matrix[0][i] == '0')
                a[0][i] = 0;
            else
                a[0][i] = 1;
            if(a[0][i] > max)
                    max = a[0][i];
        }
        for(i = 1 ; i < m ; i++){
            for(j = 1; j < n ; j++){
                int x = min(a[i-1][j],a[i][j-1],a[i-1][j-1]);
                if(matrix[i][j] == '0')
                    a[i][j] = 0;
                else
                    a[i][j] = x + 1;
                if(a[i][j] > max)
                    max = a[i][j];
            
        }
        }
        
    return max * max;    
    }
}
