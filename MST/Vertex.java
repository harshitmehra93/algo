package MST;

public class Vertex {
	Vertex parent;
	int dist;
	String name;
	enum Color{
		White,Gray,Black;
	}
	Color color;
	
	public Vertex(String name) {
		this.name=name;
		this.dist=999999999;
		this.parent=null;
		this.color=Color.White;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Vertex vertex = (Vertex) obj;
		return this.name.equals(vertex.name);
	}
}
