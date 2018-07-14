package bellman;

public class Vertex {
	int dist;
	Vertex parent;
	String name;
	public Vertex(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return new String(this.name+" "+this.dist);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Vertex v = (Vertex) obj;
		return this.name==v.name;
	}
}
