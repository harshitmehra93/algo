package bellman;
import java.util.LinkedList;
import java.util.HashMap;
public class DirectedGraph {
	HashMap<Vertex,LinkedList<Vertex>> adjList;
	int noOfVertices;
	LinkedList<Edge> edges;
	Vertex[] vertices;
	
	public DirectedGraph(Vertex[] vertices) {
		this.vertices=vertices;
		this.noOfVertices=vertices.length;
		this.adjList = new HashMap<Vertex,LinkedList<Vertex>>();
		this.edges = new LinkedList<Edge>();
		
	}
	private static class Constants {
		final static int INFINITY=999999999;
	}
	public void addEdge(Vertex source,Vertex destination,int weight) {
		if(!this.adjList.containsKey(source)) {
			this.adjList.put(source, new LinkedList<Vertex>());
		}
		this.adjList.get(source).add(destination);
		this.edges.add(new Edge(source,destination,weight));
	}
	public void printVertices() {
		for(Vertex v : this.vertices) {
			System.out.println(v);
		}
	}
	public void initializeSingleSource(Vertex root) {
		for(Vertex v : this.vertices) {
			if(v.equals(root)) {
				System.out.println("========="+v);
				v.dist=0;
				v.parent=null;
				continue;
			}
			v.dist=Constants.INFINITY;
			v.parent=null;
		}
	}
	public void relaxEdge(Edge edge) {
		if(edge.source.dist==Constants.INFINITY) {
			System.out.println("infinity");
			return;
		}
		if(edge.destination.dist>edge.source.dist+edge.weight) {
			System.out.println("relaxed  "+edge);
			edge.destination.dist=edge.source.dist+edge.weight;
			edge.destination.parent=edge.source;
		}
	}
	public boolean bellmanFord(Vertex root) {
		this.initializeSingleSource(root);
		for(int i=0;i<this.noOfVertices-1;i++) {
			System.out.println("=============pass : "+i);
			for(Edge edge:this.edges) {
				this.relaxEdge(edge);
			}
		}
		for(Edge edge:this.edges) {
			if(edge.destination.dist>edge.source.dist+edge.weight) {
				return false;
			}
		}
		return true;
	}
}
