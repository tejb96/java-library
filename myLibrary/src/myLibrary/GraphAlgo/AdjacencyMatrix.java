package myLibrary.GraphAlgo;

public class AdjacencyMatrix {
	int[] []adjMat;
	int numNodes;
	// Define adjacency matrix
	public AdjacencyMatrix(int numNodes) {
		this.numNodes=numNodes;
		adjMat=new int[numNodes][numNodes];
		for(int i=0;i<numNodes;i++) {
			for(int j=0;j<numNodes;j++) {
				adjMat[i][j]=0;
			}
		}
	}
	// Add new edges
    public void addEdge(int source, int destination, int cost) 
    {
    	adjMat[source][destination]=cost;
    	adjMat[destination][source]=cost;	
    }
    
    // return adjacency matrix
    public int[][] getAdjacencyMatrix() 
    {
    	return adjMat;
    }

    // Display adjacency matrix
    public void displayAdjacencyMatrix() 
    {
    	for(int i=0;i<numNodes;i++) {
    		System.out.print("Node "+i+": ");
			for(int j=0;j<numNodes;j++) {
				System.out.print(adjMat[i][j]+" ");
			}
			System.out.println();
		}
    }
    
    // Add any other parts needed
    
}

