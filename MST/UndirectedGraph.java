package MST;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import MST.Vertex;
import MST.Vertex.Color;
public class UndirectedGraph {
	int noOfVertices;
	Vertex[] vertices;
	HashMap<Vertex,LinkedList<Vertex>> adjList;
	HashMap<Vertex,LinkedList<Edge>> adjListEdges;
	LinkedList<Edge> undirectedEdges;
	
	public UndirectedGraph(Vertex[] vertices) {
		this.vertices=vertices;
		this.noOfVertices=vertices.length;
		this.adjList = new HashMap<Vertex,LinkedList<Vertex>>();
		this.adjListEdges = new HashMap<Vertex,LinkedList<Edge>>();
		this.undirectedEdges = new LinkedList<Edge>();
		
		for(Vertex v : this.vertices) {
			this.adjList.put(v, new LinkedList<Vertex>());
			this.adjListEdges.put(v, new LinkedList<Edge>());
		}
	}
	
	public void addUndirectedEdge(Vertex source, Vertex destination, int weight) {
		if(!this.adjList.containsKey(source)) {
			this.adjList.put(source, new LinkedList<Vertex>());
			this.adjListEdges.put(source, new LinkedList<Edge>());
		}
		
		this.adjList.get(source).add(destination);
		Edge edge = new Edge(source,destination,weight);
		this.adjListEdges.get(source).add(new Edge(source,destination,weight));
		
		if(!this.adjList.containsKey(destination)) {
			this.adjList.put(destination, new LinkedList<Vertex>());
			this.adjListEdges.put(destination, new LinkedList<Edge>());
		}
		
		this.adjList.get(destination).add(source);
		this.adjListEdges.get(destination).add(new Edge(destination,source,weight));
		
		this.undirectedEdges.add(edge);
	}
	
	public void kruskal() {
		// initializing vertices and their sets
		HashMap<Maps,HashMap> map = this.initializeVerticesKruskal();
		HashMap<Vertex,Integer> vertexMap = map.get(Maps.VertexMap);
		HashMap<Integer,LinkedList<Vertex>> setsMap = map.get(Maps.SetsMap);
		
		Iterator<Edge> it = this.undirectedEdges.iterator();
		Edge[] edgesArray = new Edge[this.undirectedEdges.size()];
		int i=0;
		while(it.hasNext()) {
			edgesArray[i]=it.next();
			i++;
		}
		
		MinHeap<Edge> minPriorityQueue = new MinHeap<Edge>(edgesArray);
		
		Edge edge;
		while(!minPriorityQueue.isEmpty()) {
			edge = minPriorityQueue.getSmallest();
			int setOfSource = vertexMap.get(edge.source);
			int setOfDestination = vertexMap.get(edge.destination);
			if(setOfSource!=setOfDestination) {
				System.out.println(edge);
				//Union of Sets
				//transfer vertices from destination set to source set & update vertexMap
				LinkedList<Vertex> verticesInSourceSet = setsMap.get(setOfSource);
				LinkedList<Vertex> verticesInDestinationSet = setsMap.get(setOfDestination);
				Iterator<Vertex> iterator = verticesInDestinationSet.iterator();
				while(iterator.hasNext()) {
					Vertex v = iterator.next();
					vertexMap.put(v, setOfSource);
					verticesInSourceSet.add(v);
				}
				setsMap.remove(setOfDestination);
			}
		}
	}
	enum Maps{
		VertexMap,SetsMap
	}
	
	public HashMap initializeVerticesKruskal() {
		HashMap<Vertex,Integer> vertexMap = new HashMap<Vertex,Integer>();
		HashMap<Integer,LinkedList<Vertex>> setsMap = new HashMap<Integer,LinkedList<Vertex>>();
		int i=1;
		for(Vertex v : this.vertices) {
			v.color=Color.White;
			v.dist=999999999;
			v.parent=null;
			vertexMap.put(v, i);
			setsMap.put(i, new LinkedList<Vertex>());
			setsMap.get(i).add(v);
			i++;
		}
		HashMap<Maps,HashMap> map = new HashMap<Maps,HashMap>();
		map.put(Maps.VertexMap, vertexMap);
		map.put(Maps.SetsMap, setsMap);
		return map;
	}
	
}
