package finalprep;

public class Edge {
	Vertex source,dest;
	int weight;
	public Edge(Vertex source,Vertex dest) {
		this.source=source;
		this.dest=dest;
		this.weight=1;
	}
	public Edge(Vertex source,Vertex dest,int weight) {
		this.source=source;
		this.dest=dest;
		this.weight=weight;
	}
	@Override
	public int hashCode() {
		return this.source.hashCode()+this.dest.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Edge edge = (Edge) obj;
		if(this.source==edge.source&&this.dest==edge.dest&&this.weight==edge.weight) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return this.source+" =="+this.weight+"==>"+this.dest;
	}
}
