package archived;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int [][]a = new int[m][n];
        
        int i,j;
        
        if(obstacleGrid[0][0] == 1)
            obstacleGrid[0][0] = 0;
        else 
            obstacleGrid[0][0] = 1;
        
        for(i = 1 ; i < m ; i++){
            if(obstacleGrid[i][0] == 1){
                obstacleGrid[i][0] = 0;
            }
            else if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 0)
                obstacleGrid[i][0] = 0;
            else if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1)
                obstacleGrid[i][0] = 1;
        }
        for(i = 1 ; i < n ; i++){
            if(obstacleGrid[0][i] == 1){
                obstacleGrid[0][i] = 0;
            }
            else if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 0)
                obstacleGrid[0][i] = 0;
            else if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1)
                obstacleGrid[0][i] = 1;
        }
        
        for(i = 1 ; i < m ; i++){
            for(j = 1; j < n ; j++){
                if(obstacleGrid[i][j] == 1)
                    obstacleGrid[i][j] = 0;
                else
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1]; 
        
            }
        }
        
        
     return obstacleGrid[m-1][n-1];   
    }
}
