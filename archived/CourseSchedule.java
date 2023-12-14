package archived;

public class CourseSchedule {
    public boolean checkCycle(ArrayList<ArrayList<Integer>> graph,boolean[] visited,int course){
		
		if(visited[course] == true)
			return false;
		else
			visited[course] = true;
		for(int i = 0 ; i < graph.get(course).size() ; i++){
			if(!checkCycle(graph,visited,graph.get(course).get(i)))
				return false;
		}
		visited[course] = false;
		return true;
	}
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {    
		
		if(numCourses <= 1)
			return true;
		
		// Declare a graph. ArrayList of ArrayLists
		ArrayList< ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer> >(numCourses);
		// boolean array to check if node of a graph is visited
		boolean[] visited = new boolean[numCourses];
		
		for(int i = 0 ; i < numCourses ; i++){
			graph.add(new ArrayList<Integer>());
		}
		for(int i = 0 ; i < prerequisites.length ; i++){
			int destination = prerequisites[i][0];
			int source = prerequisites[i][1];
			graph.get(source).add(destination);
		}
		for(int i = 0 ; i < numCourses ; i++){
			if(!checkCycle(graph,visited,i))
				return false;
		}
		return true;
    }
}
