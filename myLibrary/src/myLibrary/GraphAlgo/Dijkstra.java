package myLibrary.GraphAlgo;
import java.util.Arrays;
public class Dijkstra {

	// Apply Dijkstras algorithm
	public void Dijkstra_Algo(int[][] graph, int source) 
	{
		int v=graph.length;
		int[] dist=new int[v];
		boolean[] visited=new boolean[v];
		Arrays.fill(visited, false);
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source]=0;
		
		for(int i=0;i<v-1;i++) {
			int min=Integer.MAX_VALUE,minIndex=-1;
			for(int j=0;j<v;j++) {
				if(!visited[j]&&dist[j]<=min) {
					min=dist[j];
					minIndex=j;
				}
			}
			visited[minIndex]=true;
			for(int j=0;j<v;j++) {
				if(!visited[j]&&graph[minIndex][j]!=0&&dist[minIndex]!=Integer.MAX_VALUE
				   &&dist[minIndex]+graph[minIndex][j]<dist[j]) 
				{
					dist[j]=dist[minIndex]+graph[minIndex][j];
				}
			}
			
		}
		
		for(int i=0;i<dist.length;i++) {
			System.out.println("distance from 0 to "+i+" is "+ dist[i]);				
		}
		
	}
	  
	// Add any other parts needed
}
