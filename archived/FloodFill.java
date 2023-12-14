package archived;

class Solution {
    
    public void dfs(boolean[][] booleanArray,int i,int j,int rows,int columns,int color,int[][] image){
        //if(i < 0 || i >= rows || j < 0 || j >= columns)
        //    return;
        if(image[i][j] == color)
            booleanArray[i][j] = true;
        if(i-1 >= 0 && !booleanArray[i-1][j] && image[i-1][j] == color){
            dfs(booleanArray,i-1,j,rows,columns,color,image);
        }
        if(i+1 < rows && !booleanArray[i+1][j] && image[i+1][j] == color){
            dfs(booleanArray,i+1,j,rows,columns,color,image);
        }
        if(j - 1 >= 0 && !booleanArray[i][j-1] && image[i][j-1] == color){
            dfs(booleanArray,i,j-1,rows,columns,color,image);
        }
        if(j + 1 < columns && !booleanArray[i][j+1] && image[i][j+1] == color){
            dfs(booleanArray,i,j+1,rows,columns,color,image);
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int columns = image[0].length;
        boolean[][] booleanArray = new boolean[rows][columns];
        int color = image[sr][sc];
        dfs(booleanArray,sr,sc,rows,columns,color,image);
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                if(booleanArray[i][j] == true)
                    image[i][j] = newColor;
            }
        }
        return image;
    }
}
