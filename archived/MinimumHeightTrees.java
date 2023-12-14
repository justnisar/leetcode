package archived;

public class MinimumHeightTrees {
     public List<Integer> findMinHeightTrees(int n, int[][] edges) {
			ArrayList<HashSet<Integer>> graph = new ArrayList<>();
			List<Integer> leaves = new ArrayList<Integer>();
			if(n <= 2){
				for(int i = 0 ; i < n ; i++)
					leaves.add(i);
				return leaves;
			}
			for(int i = 0 ; i < n ; i++)
				graph.add(new HashSet<Integer>());
			for(int i = 0 ; i < edges.length ; i++){
				int source = edges[i][0];
				int destination = edges[i][1];
				graph.get(source).add(destination);
				graph.get(destination).add(source);
			}
			for(int i = 0 ; i < n ; i++)
				if(graph.get(i).size() == 1)
					leaves.add(i);
			int m = n;
			
			while(n > 2){
				n -= leaves.size();
				List<Integer> temp = new ArrayList<Integer>();
				for(int leaf : leaves){
					// clear the edges of the leaf
					int j = graph.get(leaf).iterator().next();
					graph.get(j).remove(leaf);
					if(graph.get(j).size() == 1)
						temp.add(j);
					
				}
				leaves = temp;
			}
			return leaves;
	    }
}
