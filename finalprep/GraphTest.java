package finalprep;

import java.util.Iterator;
import java.util.Stack;

import finalprep.Vertex.Color;
import java.util.LinkedList;

public class GraphTest {
	static int time=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		
		// coremen pg 596
		graph.addEdge(new Vertex("r"), new Vertex("s"));
		graph.addEdge(new Vertex("r"), new Vertex("v"));
		graph.addEdge(new Vertex("w"), new Vertex("s"));
		graph.addEdge(new Vertex("w"), new Vertex("t"));
		graph.addEdge(new Vertex("w"), new Vertex("x"));
		graph.addEdge(new Vertex("u"), new Vertex("t"));
		graph.addEdge(new Vertex("u"), new Vertex("x"));
		graph.addEdge(new Vertex("u"), new Vertex("y"));
		graph.addEdge(new Vertex("x"), new Vertex("t"));
		graph.addEdge(new Vertex("x"), new Vertex("y"));
		//graph.printAdjList();
		
		
		//bfs(graph,new Vertex("s"));
		//System.out.println("=================");
		//dfs(graph);
		
		Graph graph2 = new Graph();
		Vertex undershorts =new Vertex("undershorts");
		Vertex pants = new Vertex("pants");
		Vertex shoes = new Vertex("shoes");
		Vertex belt = new Vertex("belt");
		Vertex jacket = new Vertex("jacket");
		Vertex shirt = new Vertex("shirt");
		Vertex tie = new Vertex("tie");
		Vertex socks = new Vertex("socks");
		Vertex watch = new Vertex("watch");
		
		
		graph2.addDirectedEdge(undershorts, pants);
		graph2.addDirectedEdge(undershorts, shoes);
		graph2.addDirectedEdge(pants, shoes);
		graph2.addDirectedEdge(pants, belt);
		graph2.addDirectedEdge(belt, jacket);
		graph2.addDirectedEdge(shirt, tie);
		graph2.addDirectedEdge(tie, jacket);
		graph2.addDirectedEdge(shirt, belt);
		graph2.addDirectedEdge(socks, shoes);
		graph2.adj.put(watch, new LinkedList<Vertex>());
		graph2.vertices.add(watch);
		//graph2.printAdjList();
		//topologicalSort(graph2);
		
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		Vertex h = new Vertex("h");
		Vertex i = new Vertex("i");
		
		Graph graph3 = new Graph();
		graph3.addWeightedEdge(a,b,4);
		graph3.addWeightedEdge(b,c,8);
		graph3.addWeightedEdge(c,d,7);
		graph3.addWeightedEdge(d,e,9);
		graph3.addWeightedEdge(e,f,10);
		graph3.addWeightedEdge(f,g,2);
		graph3.addWeightedEdge(g,h,1);
		graph3.addWeightedEdge(h,a,8);
		graph3.addWeightedEdge(g,i,6);
		graph3.addWeightedEdge(i,c,2);
		graph3.addWeightedEdge(c,f,4);
		graph3.addWeightedEdge(d,f,14);
		graph3.addWeightedEdge(b,h,11);
		graph3.addWeightedEdge(h,i,7);
		prim(graph3,a);
	}
	
	private static void prim(Graph G, Vertex a) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		for(Vertex u:G.vertices) {
			u.parent=null;
			u.dist=Integer.MAX_VALUE;
			heap.add(u);
		}
		a.dist=0;
		while(!heap.isEmpty()) {
			//heap.print();
			Vertex u = heap.getMin();
			
			System.out.println(u+" dist="+u.dist);
			
			Iterator<Edge> it = G.adjEdges.get(u).iterator();
			while(it.hasNext()) {
				Edge edge = it.next();
				if(edge.dest.dist>edge.weight)
					edge.dest.dist=edge.weight;
			}
			heap.buildMinHeap();
		}
	}

	private static void topologicalSort(Graph G) {
		// TODO Auto-generated method stub
		initializeGraph(G);
		time=0;
		LinkedList<Vertex> list = new LinkedList<Vertex>();
		for(Vertex u: G.vertices) {
			if(u.color==Color.White) {
				dfsVisit2(G,u,list);
			}
		}
		Iterator<Vertex> it = list.iterator();
		System.out.print("wear ");
		while(it.hasNext()) {
			System.out.println(it.next());
			if(it.hasNext())
				System.out.print("then ");
		}
	}

	private static void dfsVisit2(Graph G, Vertex u, LinkedList<Vertex> list) {
		// TODO Auto-generated method stub
		time++;
		u.dist=time;
		u.color=Color.Gray;
		Iterator<Vertex> it = G.adj.get(u).iterator();
		while(it.hasNext()) {
			Vertex v = it.next();
			if(v.color==Color.White) {
				v.parent=u;
				dfsVisit2(G,v,list);
			}
			
		}
		time++;
		u.color=Color.Black;
		list.addFirst(u);
		
	}

	public static void bfs(Graph G, Vertex s) {
		initializeGraph(G);
		if(!G.vertices.contains(s)) {
			System.out.println("source not found");
			return;
		}
		for(Vertex tmp: G.vertices) {
			if(tmp.name.equals(s.name)) {
				System.out.println("source found");
				s=tmp;
				break;
			}
		}
		s.dist=0;
		s.color=Color.Gray;
		s.parent=null;
		Queue queue = new Queue();
		queue.enqueue(s);
		while(!queue.isEmpty()) {
			Vertex u = queue.dequeue();
			Iterator<Vertex> it = G.adj.get(u).iterator();
			while(it.hasNext()) {
				Vertex v = it.next();
				if(v.color==Color.White) {
					v.color=Color.Gray;
					v.dist=u.dist+1;
					v.parent=u;
					queue.enqueue(v);
				}
			}
			u.color=Color.Black;
			System.out.println(u);
		}
	}

	private static void initializeGraph(Graph g) {
		// TODO Auto-generated method stub
		for(Vertex v : g.vertices) {
			v.color=Color.White;
			v.parent=null;
			v.dist=Integer.MAX_VALUE;
		}
	}
	public static void dfs(Graph G) {
		initializeGraph(G);
		for(Vertex u: G.vertices) {
			if(u.color==Color.White) {
				dfsVisit(G,u);
			}
		}
	}
	public static void dfsVisit(Graph G,Vertex s) {
		time++;
		s.color=Color.Gray;
		s.parent=null;
		s.dist=time;
		Iterator<Vertex> it = G.adj.get(s).iterator();
		while(it.hasNext()) {
			Vertex v = it.next();
			if(v.color==Color.White) {
				v.parent=s;
				dfsVisit(G,v);
			}
		}
		s.color=Color.Black;
		time++;
		s.f=time;
		System.out.println(s);
	}

}
