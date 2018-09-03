package finalprep;

public class HeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		/*
		heap.add(7);
		heap.add(4);
		heap.add(9);
		heap.add(1);
		heap.add(20);
		heap.add(22);
		heap.add(6);*/
		Vertex a = new Vertex("a");
		a.dist=5;
		Vertex b = new Vertex("b");
		b.dist=7;
		Vertex c = new Vertex("c");
		c.dist=2;
		Vertex d = new Vertex("d");
		d.dist=9;
		heap.add(a);
		heap.add(b);
		heap.add(c);
		heap.add(d);
		System.out.println("============================================");
		heap.buildMinHeap();
		System.out.println("============================================");
		for(int i=0;i<20;i++) {
			System.out.println(heap.getMin());
		}
		
	}

}
