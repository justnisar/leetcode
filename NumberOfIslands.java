public class NumberOfIslands {
    
    public static void DFS(int x,int y,int m,int n,boolean visited[][],char grid[][]){
        visited[x][y] = true;
      
        if(x+1 < m && !visited[x+1][y] && grid[x+1][y] == '1')
            DFS(x+1,y,m,n,visited,grid);
        if(y+1 < n && !visited[x][y+1] && grid[x][y+1] == '1')
            DFS(x,y+1,m,n,visited,grid);
        if(x-1 >= 0 && !visited[x-1][y] && grid[x-1][y] == '1')
            DFS(x-1,y,m,n,visited,grid);
        if(y-1 >= 0 && !visited[x][y-1] && grid[x][y-1] == '1')
            DFS(x,y-1,m,n,visited,grid);
            
        
        
    }
    
    
    
    public static int numIslands(char[][] grid) {
        if(grid == null)
            return 0;
        int m = grid.length;
        int n = 0;
        if(m != 0)
        n = grid[0].length;
        
        if(m == 0 || n == 0)
            return 0;
        
        boolean visited[][] = new boolean[m][n];
       
        for(int i = 0 ; i < m ; i++){
        	for(int j = 0 ; j < n ; j++){
        		visited[i][j] = false;
        	}
        }
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    DFS(i,j,m,n,visited,grid);
                    count++;
                    
                    
                }
                    
            }
        }
        
    return count;    
    }
}
