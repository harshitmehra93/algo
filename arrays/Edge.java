package arrays;

public class Edge {
	Vertex source,destination;
	int weight;
	public Edge(Vertex source, Vertex destination, int weight) {
		this.source=source;
		this.destination=destination;
		this.weight=weight;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object edge) {
		Edge edge2=(Edge) edge;
		if((this.source==edge2.source)&&(this.destination==edge2.destination)) {
			return true;
		}else {
			return false;
		}
	}
}
