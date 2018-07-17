package directedgraph;

public class DirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex<String>[] vertices = new Vertex[]{new Vertex("a"),new Vertex("b"),new Vertex("c"),new Vertex("d"),new Vertex("e"),new Vertex("f")};
		DirectedGraph<String> graph = new DirectedGraph<String>(vertices);
		
		graph.addEdge(vertices[2], vertices[3]);
		graph.addEdge(vertices[3], vertices[0]);
		graph.addEdge(vertices[0], vertices[5]);
		graph.addEdge(vertices[1], vertices[5]);
		graph.addEdge(vertices[3], vertices[1]);

		graph.DFS();
	}

}
