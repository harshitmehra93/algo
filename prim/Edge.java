package prim;

public class Edge {
	Vertex source,destination;
	int weight;
	public Edge(Vertex source,Vertex destination, int weight) {
		this.source=source;
		this.destination=destination;
		this.weight=weight;
	}
	public Edge(Vertex source, Vertex destination) {
		this.source=source;
		this.destination=destination;
		this.weight=0;
	}
	@Override
	public String toString() {
		return new String(this.source.name+" --"+this.weight+"-->"+" "+this.destination.name);
	}
}
