package directedgraph;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import directedgraph.Vertex.Color;
public class DirectedGraph<E> {
	HashMap<Vertex,LinkedList<Vertex>> adjList;
	LinkedList<Vertex> buildOrder;
	Vertex[] vertices;
	int noOfVertices;
	DirectedGraph(Vertex[] vertices){
		this.vertices=vertices;
		this.noOfVertices=vertices.length;
		this.adjList=new HashMap<Vertex,LinkedList<Vertex>>();
		this.buildOrder=new LinkedList<Vertex>();
	}
	public void addEdge(Vertex source, Vertex destination) {
		System.out.println(source+"  "+destination);
		if(!this.adjList.containsKey(source)) {
			this.adjList.put(source, new LinkedList<Vertex>());
		}
		this.adjList.get(source).add(destination);
	}
	public void DFS(){
		this.initializeVertices();
		
		
		for(Vertex u:this.vertices) {
			if(u.color==Color.White) {
				System.out.println(u);
				this.DFSVisit(u);
			}
		}
	}
	
	private void DFSVisit(Vertex u) {
		// TODO Auto-generated method stub
		u.color=Color.Grey;
		if(this.adjList.containsKey(u)) {
			Iterator<Vertex> adj = this.adjList.get(u).iterator();
		
			while(adj.hasNext()) {
				Vertex v=adj.next();
				if(v.color==Color.White) {
					this.DFSVisit(v);
				}
			}
		}
		u.color=Color.Black;
		this.buildOrder.add(u);
	}
	private void initializeVertices() {
		// TODO Auto-generated method stub
		for(Vertex v : this.vertices) {
			v.color=Color.White;
			v.dist=Integer.MAX_VALUE;
			v.parent=null;
		}
		
	}
}
