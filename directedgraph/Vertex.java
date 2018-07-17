package directedgraph;

public class Vertex<E> {
	E data;
	Vertex<E> parent;
	enum Color{
		Grey,White,Black
	}
	Color color;
	int dist;
	Vertex(E data){
		this.color=Color.White;
		this.dist=Integer.MAX_VALUE;
		this.data=data;
		this.parent=null;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
}
