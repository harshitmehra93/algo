package dijkstras;


public class MinHeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex[] vertices= {new Vertex("a",5),new Vertex("b",9),new Vertex("c",2),new Vertex("d",7),new Vertex("e",3),new Vertex("f",11),new Vertex("g",1)};
		MinHeap heap = new MinHeap(vertices);
		
		System.out.println(heap.containsKey(new Vertex("g",0)));
	}

}
