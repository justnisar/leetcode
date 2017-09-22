
public class Solution {
  
  public boolean recFun(int i,int j,int index,String word,int rows,int columns,boolean[][] visited,char[][] board){
    if(index == word.length())
      return true;
    if(i < 0 || i >= rows || j < 0 || j >= columns || word.charAt(index) != board[i][j] || visited[i][j])
      return false;
    visited[i][j] = true;
    if(recFun(i-1,j,index+1,word,rows,columns,visited,board)
     ||recFun(i+1,j,index+1,word,rows,columns,visited,board) 
     ||recFun(i,j-1,index+1,word,rows,columns,visited,board)
     ||recFun(i,j+1,index+1,word,rows,columns,visited,board))
      return true;
    visited[i][j] = false;
    return false;
  }
  
  public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int length = word.length();
    if(length == 0 || rows == 0)
      return false;
    int columns = board[0].length;
    boolean[][] visited = new boolean[rows][columns];
    for(int i = 0 ; i < rows ; i++){
      for(int j = 0 ; j < columns ; j++){
        if(board[i][j] == word.charAt(0) && recFun(i,j,0,word,rows,columns,visited,board))
          return true;
      }
    }
    return false;
  }
/*
  public static void main(String[] args) {
    WordSearch obj = new WordSearch();
    char[][] array = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    System.out.println(obj.exist(array, "ABCCED"));
    System.out.println(obj.exist(array, "SEE"));
    System.out.println(obj.exist(array, "ABCB"));

  }
*/
}

