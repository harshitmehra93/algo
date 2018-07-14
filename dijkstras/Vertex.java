package dijkstras;

public class Vertex implements Comparable{
	
	Integer dist;
	String name;
	Vertex parent;
	public Vertex(String name) {
		this.name=name;
		this.dist=Constants.INFINITY;
		this.parent=null;
	}
	public Vertex(String name, int dist) {
		this.name=name;
		this.dist=dist;
		this.parent=null;
	}
	static class Constants{
		final static int INFINITY=999999999;
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
		Vertex v = (Vertex)obj;
		return this.name.equals(v.name);
	}
	@Override
	public int compareTo(Object obj) {
		Vertex v=(Vertex)obj;
		if(this.dist<v.dist) {
			return -1;
		}else if(this.dist==v.dist) {
			return 0;
		}else {
			return 1;
		}
	}
}
