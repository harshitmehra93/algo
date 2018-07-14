package MST;

import MST.UndirectedGraph;
import MST.Vertex;

public class UndirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex vertices[] = new Vertex[9];
		// Graph on page 632 cormen
		vertices[0] = new Vertex("a");
		vertices[1] = new Vertex("b");
		vertices[2] = new Vertex("c");
		vertices[3] = new Vertex("d");
		vertices[4] = new Vertex("e");
		vertices[5] = new Vertex("f");
		vertices[6] = new Vertex("g");
		vertices[7] = new Vertex("h");
		vertices[8] = new Vertex("i");
		
		UndirectedGraph graph = new UndirectedGraph(vertices);
		for(Vertex v : graph.adjList.keySet()) {
			System.out.println(v.name);
		}
		
		graph.addUndirectedEdge(vertices[0], vertices[1], 4);
		graph.addUndirectedEdge(vertices[1], vertices[2], 8);
		graph.addUndirectedEdge(vertices[2], vertices[3], 7);
		graph.addUndirectedEdge(vertices[3], vertices[4], 9);
		graph.addUndirectedEdge(vertices[4], vertices[5], 10);
		graph.addUndirectedEdge(vertices[5], vertices[6], 2);
		graph.addUndirectedEdge(vertices[6], vertices[7], 1);
		graph.addUndirectedEdge(vertices[7], vertices[8], 7);
		graph.addUndirectedEdge(vertices[7], vertices[0], 8);
		graph.addUndirectedEdge(vertices[8], vertices[2], 2);
		graph.addUndirectedEdge(vertices[2], vertices[5], 4);
		graph.addUndirectedEdge(vertices[8], vertices[6], 6);
		graph.addUndirectedEdge(vertices[3], vertices[5], 14);
		graph.addUndirectedEdge(vertices[1], vertices[7], 11);

		System.out.println("======Kruskal======");
		graph.kruskal();
		
	}

}
