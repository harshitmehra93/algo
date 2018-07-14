package arrays;
import arrays.Vertex;
public class UnDirectedGraphTest {
	public static void main(String[] args){
		Vertex vertices[] = new Vertex[8];
		// Graph on page 596 cormen
		//0 = r
		vertices[0] = new Vertex("r");
		//1 = s
		vertices[1] = new Vertex("s");
		//2 = t
		vertices[2] = new Vertex("t");
		//3 = u
		vertices[3] = new Vertex("u");
		//4 = v
		vertices[4] = new Vertex("v");
		//5 = w
		vertices[5] = new Vertex("w");
		//6 = x
		vertices[6] = new Vertex("x");
		//7 = y
		vertices[7] = new Vertex("y");
		
		UnDirectedGraph graph = new UnDirectedGraph(vertices);
		for(Vertex v : graph.adj.keySet()) {
			System.out.println(v.name);
		}
		
		graph.addEdge(vertices[1], vertices[0]);
		graph.addEdge(vertices[0], vertices[4]);
		graph.addEdge(vertices[5], vertices[2]);
		graph.addEdge(vertices[5], vertices[6]);
		graph.addEdge(vertices[2], vertices[3]);
		graph.addEdge(vertices[6], vertices[3]);
		graph.addEdge(vertices[6], vertices[7]);
		graph.addEdge(vertices[3], vertices[7]);
		graph.addEdge(vertices[1], vertices[5]);
		graph.addEdge(vertices[2], vertices[6]);
		
		System.out.println("===============");
		graph.printAdjacencyList();
		
		System.out.println("=======BFS========");
		graph.breadthFirstSearch(vertices[1]);
		
		System.out.println("=======DFS========");
		graph.depthFirstSearch(vertices[1]);
	}
}
