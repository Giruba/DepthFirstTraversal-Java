import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		System.out.println("Depth First Traversal of a Graph");
		System.out.println("--------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of vertices in the graph");
			int vertices = scanner.nextInt();
			Graph graph = new Graph(vertices);
			for(int index = 0; index < vertices; index++) {
				System.out.println("Enter the number of adjacent vertices for vertex"
						+ " "+index);
				int numberOfAdjacentVertices = scanner.nextInt();
				for(int adjVertex = 0; adjVertex < numberOfAdjacentVertices; adjVertex++) {
					graph.SetEdge(index, scanner.nextInt());
				}
			}
			graph.DepthFirstTraversalOfAGraph();
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getLocalizedMessage());
		}
	}
}
