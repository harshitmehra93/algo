package dijkstras;

public class Edge {
	int weight;
	Vertex source,destination;
	public Edge(Vertex source,Vertex destination,int weight) {
		this.source=source;
		this.destination=destination;
		this.weight=weight;
	}
	@Override
	public boolean equals(Object obj) {
		Edge edge = (Edge)obj;
		if(this.weight==edge.weight&&this.source.equals(edge.source)&&this.destination.equals(edge.destination)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return new String(this.source.name+" --"+this.weight+"-->"+" "+this.destination.name);
	}
}
