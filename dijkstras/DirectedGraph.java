package dijkstras;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class DirectedGraph {
	HashMap<Vertex,LinkedList<Vertex>> adjList;
	HashMap<Vertex,LinkedList<Edge>> adjListEdges;
	int noOfVertices;
	Vertex[] vertices;
	public DirectedGraph(Vertex[] vertices) {
		this.noOfVertices=vertices.length;
		this.adjList= new HashMap<Vertex,LinkedList<Vertex>>();
		this.adjListEdges= new HashMap<Vertex,LinkedList<Edge>>();
		
	}
	public void addEdge(Vertex source,Vertex destination,int weight) {
		if(!this.adjList.containsKey(source)) {
			this.adjList.put(source, new LinkedList<Vertex>());
		}
		this.adjList.get(source).add(destination);
		Edge edge=new Edge(source,destination,weight);
		if(!this.adjListEdges.containsKey(source)) {
			this.adjListEdges.put(source, new LinkedList<Edge>());
		}
		this.adjListEdges.get(source).add(edge);
	}
	public void djikstras(Vertex root) {
		this.initializeSingleSource(root);
		MinHeap minQueue = new MinHeap(this.vertices);
		while(!minQueue.isEmpty()) {
			Vertex u = minQueue.getSmallest();
			System.out.println("====Visisted======="+u);
			Iterator<Edge> it = this.adjListEdges.get(u).iterator();
			while(it.hasNext()) {
				Edge edge = it.next();
				
				this.relaxEdge(edge);
				System.out.println("relaxed edge :"+edge);
				minQueue.buildMinHeap();
			}
		}
	}
	public void relaxEdge(Edge edge) {
		if(edge.destination.dist>edge.source.dist+edge.weight) {
			edge.destination.dist=edge.source.dist+edge.weight;
			edge.destination.parent=edge.source;
		}
	}
	public void initializeSingleSource(Vertex root) {
		Set<Vertex> keySet = this.adjListEdges.keySet();
		this.vertices = new Vertex[keySet.size()];
		int i=0;
		for(Vertex v : keySet) {
			this.vertices[i]=v;
			i++;
			if(v.equals(root)) {
				v.dist=0;
			}else {
				v.dist=Vertex.Constants.INFINITY;
				v.parent=null;
			}
		}
	}
	public void printLists() {
		System.out.println("=====adjList======");
		for(Map.Entry<Vertex, LinkedList<Vertex>> entry : this.adjList.entrySet()) {
			System.out.print(entry.getKey().name+" ");
			Iterator<Vertex> it = entry.getValue().iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
		System.out.println("=====adjListEdges======");
		for(Map.Entry<Vertex, LinkedList<Edge>> entry : this.adjListEdges.entrySet()) {
			System.out.print(entry.getKey()+" ");
			Iterator<Edge> it = entry.getValue().iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
	
}
