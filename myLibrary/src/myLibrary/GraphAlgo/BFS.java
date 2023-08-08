package myLibrary.GraphAlgo;
import myLibrary.DataStructures.Linear.Queue;
import java.util.Arrays;
public class BFS 
{
	
	// Define BFS 
	AdjacencyMatrix adjMat;
	Queue q;
	Boolean[] visited;
	int numNodes;
	int[] visit;
	// You can use either adjacency matrix or adjacency list to keep track of the graph
	
	public BFS(int num_nodes) {
		// TODO Auto-generated constructor stub
		numNodes=num_nodes;
		adjMat=new AdjacencyMatrix(num_nodes);
		q=new Queue(num_nodes);
		visited=new Boolean[num_nodes];
		Arrays.fill(visited, false);
		visit=new int[num_nodes];
	}

	// Add edge to graph
    public void addEdge(int v,int w)
    {
    	adjMat.addEdge(v, w, 1);
    }
 
    // Apply BFS algorithm and display the nodes visited and the visit array values
    // See the sample output to create a proper format
    public void BFS_Algo(int n)
    {
    	int[][] adjMatrix=adjMat.getAdjacencyMatrix();
    	int vis=n;
		q.enqueue(vis);
		visited[vis]=true;
		int t=0;
		while(!q.isEmpty()) {
			vis=q.dequeue();
			visit[t]=vis;
			for(int i=0;i<numNodes;i++) {
				if(adjMatrix[vis][i]==1&&(!visited[i])) {
					q.enqueue(i);
					visited[i]=true;
					
				}
			}
			t++;
		}
		for(int i=0;i<visited.length;i++) {
			System.out.print(visit[i]+" - ");				
		}
		System.out.println("\nVisited nodes: "+ Arrays.toString(visited));
    }
	
	// Add any other parts needed
}
