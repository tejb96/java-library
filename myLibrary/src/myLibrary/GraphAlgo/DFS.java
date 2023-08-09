package myLibrary.GraphAlgo;
import java.util.Arrays;
import myLibrary.DataStructures.Linear.Stack;
public class DFS {
	
	// Define BFS 
	AdjacencyMatrix adjMat;
	Stack stack;
	boolean[] visited;
	int numNodes;
	int[] visit;
	
	// You can use either adjacency matrix or adjacency list to keep track of the graph
	public DFS(int num_nodes) {
		numNodes=num_nodes;
		adjMat=new AdjacencyMatrix(num_nodes);
		stack=new Stack(num_nodes);
		visited=new boolean[num_nodes];
		Arrays.fill(visited, false);
		visit=new int[num_nodes];
	}	
	// Add edge to graph
    public void addEdge(int v, int w)
    {
    	adjMat.addEdge(v, w, 1);
    }
 
    // Apply DFS algorithm and display the nodes visited and the visit array values
    // See the sample output to create a proper format
    public void DFS_Algo(int v)
    {
    	int vis=v;
    	int[][] adjMatrix=adjMat.getAdjacencyMatrix();
    	stack.push(vis);
    	int t=0;
    	while(!stack.isEmpty()) {
    		vis=stack.pop();
    		if(!visited[vis]) {
    			visited[vis]=true;
    			visit[t]=vis;
    			t++;
    		}
    		for(int i=0;i<numNodes;i++) {
    			if(!visited[i]&&adjMatrix[vis][i]==1) {
    				stack.push(i);
    			}
    		}
    	}
    	for(int i=0;i<t;i++) {
    		System.out.print(visit[i]+" - ");				
    	}
		System.out.println("\nVisited nodes: "+ Arrays.toString(visited));
    }
    
    // Add any other parts needed
}
