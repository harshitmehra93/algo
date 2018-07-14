package prim;

public class Vertex implements Comparable{
	Integer dist;
	Vertex parent;
	String name;
	public Vertex(String name) {
		this.dist=999999999;
		this.parent=null;
		this.name=name;
	}
	public Vertex(String name, int dist) {
		this.dist=dist;
		this.parent=null;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Vertex v =(Vertex)obj;
		return this.name==v.name;
	}
	@Override
	public int compareTo(Object obj) {
		Vertex v = (Vertex)obj;
		return this.dist.compareTo(v.dist);
	}
	@Override
	public String toString() {
		return new String(this.name+" "+this.dist);
	}
}
