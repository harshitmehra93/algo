package dijkstras;

public class DirectedGraphTest {
	public static void main(String[] args) {
		Vertex[] vertices;
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex x = new Vertex("x");
		Vertex y = new Vertex("y");
		Vertex z = new Vertex("z");
		vertices = new Vertex[]{s,t,x,y,z};
		
		DirectedGraph graph = new DirectedGraph(vertices);
		
		graph.addEdge(s, t, 10);
		graph.addEdge(s, y, 5);
		graph.addEdge(t, x, 1);
		graph.addEdge(t, y, 2);
		graph.addEdge(x, z, 4);
		graph.addEdge(z, x, 6);
		graph.addEdge(z, s, 7);
		graph.addEdge(y, z, 2);
		graph.addEdge(y, t, 3);
		graph.addEdge(y, x, 9);

		
		graph.djikstras(s);
	}
}
