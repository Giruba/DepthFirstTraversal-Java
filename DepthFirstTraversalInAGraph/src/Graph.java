
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	private int numberOfVertices;
	private LinkedList<Integer> []adjacencyList;
	
	public Graph(int vertices) {
		this.numberOfVertices = vertices;
		adjacencyList = new LinkedList[this.numberOfVertices];
		for(int index = 0; index < this.numberOfVertices; index++) {
			adjacencyList[index] = new LinkedList();
		}
	}
	
	public void SetGraphVertices(int value) {
		this.numberOfVertices = value;
	}
	
	public void SetGraphAdjacencyList(LinkedList<Integer> []adjList) {
		this.adjacencyList = adjList;
	}
	
	public void SetEdge(int sourceVertex, int adjacentVertex) {
		this.adjacencyList[sourceVertex].add(adjacentVertex);
	}
	
	public int GetGraphVertices() {
		return this.numberOfVertices;
	}
	
	public LinkedList<Integer>[] GetGraphAdjacencyList(){
		return this.adjacencyList;
	}
	
	public LinkedList<Integer> GetAdjacencyListOfAVertex(int vertex) {
		return this.adjacencyList[vertex];
	}
	
	public void DepthFirstTraversalOfAGraph() {
		boolean []visited = new boolean[this.numberOfVertices];
		
		System.out.println("Depth First Traversal of the graph -------");
		for(int index = 0; index < this.numberOfVertices; index++) {
			if(visited[index] != true) {
				_DepthFirstTraversal(index, visited);
			}
		}
	}
	
	private void _DepthFirstTraversal(int vertex, boolean []visited) {
		visited[vertex] = true;
		System.out.print(vertex+ " ");
		
		Iterator<Integer> adjListIterator = this.adjacencyList[vertex].iterator();
		while(adjListIterator.hasNext()) {
			int value = adjListIterator.next();
			if(visited[value] != true) {
				_DepthFirstTraversal(value, visited);
			}
		}
	}	
}