package finalprep;

public class Vertex implements Comparable{
	String name;
	Vertex parent;
	Integer dist;
	int f;
	Color color;
	enum Color{
		White,Gray,Black
	}
	public Vertex(String name) {
		this.name=name;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Vertex v = (Vertex)obj;
		return this.name.equals(v.name);
	}
	@Override
	public String toString() {
		return this.name/*+" d="+this.dist+" f="+this.f*/;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Vertex v = (Vertex)o;
		return this.dist.compareTo(v.dist);
	}
}
