import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
    public int cutOffTree(List<List<Integer>> forest) {
        int rows = forest.size();
        int columns = forest.get(0).size();
        int[][] array = new int[rows][columns];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>( (a,b) -> a[2] - b[2] );
        for(int i = 0 ; i < rows ; i++)
          for(int j = 0 ; j < columns ; j++){
            array[i][j] = forest.get(i).get(j);
            if(array[i][j] > 1){
              int[] point = {i,j,array[i][j]};
              priorityQueue.add(point);
            }
          }
       int[] source = {0,0};
       int steps = 0;
       while(!priorityQueue.isEmpty()){
         int[] target = priorityQueue.poll();
         int step = bfs(source,target,array);
         if(step == -1)
           return -1;
         steps += step;
         source = new int[]{target[0],target[1]};
       }
        return steps;
    }
    
    public int bfs(int[] source,int[] target,int[][] array){
      int rows = array.length;
      int columns = array[0].length;
      Queue<int[]> queue = new LinkedList<int[]>();
      queue.add(source);
      int steps = 0;
      boolean[][] visited = new boolean[array.length][array[0].length];
      visited[source[0]][source[1]] = true;
      while(!queue.isEmpty()){
        int size = queue.size();
        for(int i = 0 ; i < size ; i++){
          int[] current = queue.poll();
          if(current[0] == target[0] && current[1] == target[1])
            return steps;
          //visited[current[0]][current[1]] = true;
          for(int[] dir : direction){
            int nextRow = current[0] + dir[0];
            int nextColumn = current[1] + dir[1];
            if(nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns 
                || array[nextRow][nextColumn] == 0 || visited[nextRow][nextColumn])
              continue;
            queue.add(new int[]{nextRow,nextColumn});
            visited[nextRow][nextColumn] = true;
          }
        }
        steps++;
      }
      return -1;
    }
    /*
    public static void main(String[] args){
      CutOffTreesForGolfEvent obj = new CutOffTreesForGolfEvent();
      List<List<Integer>> list = new ArrayList<List<Integer>>();
      List<Integer> al = new ArrayList<Integer>();
      al.add(2);
      al.add(3);
      al.add(4);
      list.add(al);
      al = new ArrayList<Integer>();
      al.add(0);
      al.add(0);
      al.add(5);
      list.add(al);
      al = new ArrayList<Integer>();
      al.add(6);
      al.add(7);
      al.add(8);
      list.add(al);
      System.out.println(obj.cutOffTree(list));
    }
    */
    
}
