package MST;

public class Edge implements Comparable{
	Vertex source,destination;
	Integer weight;
	public Edge(Vertex source, Vertex destination,int weight) {
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
	public int compareTo(Object o) {
		Edge edge=(Edge)o;
		return this.weight.compareTo(edge.weight);
	}
	
	@Override
	public String toString() {
		return new String(this.source.name+" --"+this.weight+"-->"+" "+this.destination.name);
	}
}
