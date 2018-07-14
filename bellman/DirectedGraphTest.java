package bellman;

public class DirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// graph on cormen 652
		Vertex[] vertices = new Vertex[5];
		vertices[0]=new Vertex("s");
		vertices[1]=new Vertex("t");
		vertices[2]=new Vertex("x");
		vertices[3]=new Vertex("z");
		vertices[4]=new Vertex("y");
		
		DirectedGraph graph = new DirectedGraph(vertices);
		
		graph.addEdge(vertices[0], vertices[1], 6);
		graph.addEdge(vertices[1], vertices[2], 5);
		graph.addEdge(vertices[2], vertices[1], -2);
		graph.addEdge(vertices[1], vertices[4], 8);
		graph.addEdge(vertices[0], vertices[4], 7);
		graph.addEdge(vertices[4], vertices[2], -3);
		graph.addEdge(vertices[4], vertices[3], 9);
		graph.addEdge(vertices[3], vertices[2], 7);
		graph.addEdge(vertices[3], vertices[0], 2);
		graph.addEdge(vertices[1], vertices[3], -4);
		
		System.out.println(graph.bellmanFord(vertices[0]));
		graph.printVertices();
	}

}
