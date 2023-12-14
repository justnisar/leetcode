package archived;

public class MinimumPathSum {
    public int getmin(int a,int b){
        if(a < b)
            return a;
        else 
            return b;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                int min;
                if( i-1 >= 0 && j-1 >= 0){
                    grid[i][j] = grid[i][j] + getmin(grid[i-1][j],grid[i][j-1]);
                }
                else if(i-1 >= 0 && j-1 < 0){
                       grid[i][j] = grid[i][j] + grid[i-1][j];
                }
                else if(i-1 < 0 && j-1 >= 0){
                        grid[i][j] = grid[i][j] + grid[i][j-1];
                }
                
            }
        }
        return grid[m-1][n-1];
    }
}
