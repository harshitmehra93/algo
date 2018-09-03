package finalprep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
	HashSet<Vertex> vertices;
	HashMap<Vertex,LinkedList<Vertex>> adj;
	
	//weight function
	HashMap<Vertex,LinkedList<Edge>> adjEdges;
	
	public Graph() {
		this.vertices=new HashSet<Vertex>();
		this.adj=new HashMap<Vertex,LinkedList<Vertex>>();
		this.adjEdges=new HashMap<Vertex,LinkedList<Edge>>();
	}
	public void addEdge(Vertex source,Vertex dest) {
		if(!vertices.contains(source)) {
			vertices.add(source);
		}
		if(!vertices.contains(dest)) {
			vertices.add(dest);
		}
		
		//adj list
		if(!adj.containsKey(source)) {
			adj.put(source, new LinkedList<Vertex>());
		}
		adj.get(source).add(dest);
		if(!adj.containsKey(dest)) {
			adj.put(dest, new LinkedList<Vertex>());
		}
		adj.get(dest).add(source);
		
		//adj edge list cum weight function
		if(!adjEdges.containsKey(source)) {
			adjEdges.put(source,new LinkedList<Edge>());
		}
		adjEdges.get(source).add(new Edge(source,dest));
		if(!adjEdges.containsKey(dest)) {
			adjEdges.put(dest,new LinkedList<Edge>());
		}
		adjEdges.get(dest).add(new Edge(dest,source));
	}
	public void addWeightedEdge(Vertex source,Vertex dest,int weight) {
		if(!vertices.contains(source)) {
			vertices.add(source);
		}
		if(!vertices.contains(dest)) {
			vertices.add(dest);
		}
		
		//adj list
		if(!adj.containsKey(source)) {
			adj.put(source, new LinkedList<Vertex>());
		}
		adj.get(source).add(dest);
		if(!adj.containsKey(dest)) {
			adj.put(dest, new LinkedList<Vertex>());
		}
		adj.get(dest).add(source);
		
		//adj edge list cum weight function
		if(!adjEdges.containsKey(source)) {
			adjEdges.put(source,new LinkedList<Edge>());
		}
		adjEdges.get(source).add(new Edge(source,dest,weight));
		if(!adjEdges.containsKey(dest)) {
			adjEdges.put(dest,new LinkedList<Edge>());
		}
		adjEdges.get(dest).add(new Edge(dest,source,weight));
	}
	
	public void addDirectedEdge(Vertex source,Vertex dest) {
		if(!vertices.contains(source)) {
			vertices.add(source);
		}
		if(!vertices.contains(dest)) {
			vertices.add(dest);
		}
		
		//adj list
		if(!adj.containsKey(source)) {
			adj.put(source, new LinkedList<Vertex>());
		}
		if(!adj.containsKey(dest)) {
			adj.put(dest, new LinkedList<Vertex>());
		}
		adj.get(source).add(dest);
		
		//adj edge list cum weight function
		if(!adjEdges.containsKey(source)) {
			adjEdges.put(source,new LinkedList<Edge>());
		}
		adjEdges.get(source).add(new Edge(source,dest));
		
	}
	
	public void printAdjList() {
		for(Map.Entry<Vertex, LinkedList<Vertex>> entry: adj.entrySet()) {
			Iterator<Vertex> it = entry.getValue().iterator();
			System.out.print(entry.getKey()+" => ");
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
}
