package arrays;
import java.util.LinkedList;
import arrays.Vertex.color;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import arrays.Vertex;
import java.util.Stack;

public class UnDirectedGraph {
	int noOfVertices;
	Vertex[] vertices;
	HashMap<Vertex,LinkedList<Vertex>> adj;

	public UnDirectedGraph(Vertex[] vertices) {
		this.vertices = vertices;
		this.noOfVertices = vertices.length;
		this.adj = new HashMap<Vertex,LinkedList<Vertex>>();
		for(Vertex vertex : vertices) {
			adj.put(vertex, new LinkedList<Vertex>());
		}
	}

	public boolean addEdge(Vertex source, Vertex destination) {
		if(this.adj.containsKey(source)) {
			LinkedList<Vertex> tmp = this.adj.get(source);
			if(tmp==null) {
				tmp = new LinkedList<Vertex>();
			}
			tmp.add(destination);

			tmp = this.adj.get(destination);
			tmp.add(source);
			return true;
		}else {
			return false;
		}
	}

	public void printAdjacencyList() {
		for(Map.Entry<Vertex, LinkedList<Vertex>> entry : this.adj.entrySet()) {
			System.out.print(entry.getKey().name);
			LinkedList<Vertex> list = entry.getValue();
			Iterator it = list.iterator();
			while(it.hasNext()) {
				Vertex v = (Vertex)it.next();
				System.out.print(" "+ v.name);
			}
			System.out.println();
		}
	}

	public void breadthFirstSearch(Vertex source) {
		this.initializeVertices();
		if(!this.adj.containsKey(source)) {
			System.out.print("source vertex not found in graph");
			return;
		}else {
			Queue<Vertex> queue = new Queue<Vertex>();
			queue.enqueue(source);
			source.color=color.Gray;
			source.dist=0;
			Vertex u,v;
			LinkedList<Vertex> adjVertices;
			while(!queue.isEmpty()) {
				u=queue.dequeue();
				if(u.color==color.Gray) {
					System.out.print(u.name);
					u.color=color.Black;

					//compensating source node
					if(u.parent!=null) {
						u.dist=u.parent.dist+1;
					}
					System.out.println("  "+u.dist);
					//System.out.println("=====node====");

					adjVertices = this.adj.get(u);
					Iterator<Vertex> it = adjVertices.iterator();
					while(it.hasNext()) {
						v=it.next();
						if(v.color==color.White) {
							v.color=color.Gray;
							v.parent=u;
							v.dist=v.parent.dist+1;
							queue.enqueue(v);
						}
					}
					//queue.printQueue();
				}
			}
		}
	}

	public void depthFirstSearch(Vertex source) {
		this.initializeVertices();

		if(this.adj.containsKey(source)) {
			source.color=color.Gray;
			source.dist=0;
			Stack<Vertex> stack = new Stack<Vertex>();
			stack.push(source);
			Vertex u,v;
			LinkedList<Vertex> adjVertices;
			while(!stack.isEmpty()) {
				u=stack.pop();
				if(u.color==color.Gray) {
					if(u.parent!=null) {
						u.dist=u.parent.dist+1;
					}

					adjVertices = this.adj.get(u);
					u.color=color.Black;
					System.out.println(u +" "+u.dist);
					Iterator<Vertex> it = adjVertices.iterator();

					while(it.hasNext()) {
						v=it.next();
						if(v.color==color.White) {
							v.color=color.Gray;
							v.parent=u;
							v.dist=v.parent.dist+1;
							stack.push(v);
						}
					}
				}
			}
		}
	}

	public void initializeVertices() {
		for(Vertex v : this.vertices) {
			v.parent = null;
			v.dist=999999999;
			v.color=color.White;
		}
	}

}
