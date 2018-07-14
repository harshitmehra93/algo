package MST;

public class MinHeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge[] edgeArray = {new Edge(null,null,1),new Edge(null,null,18),new Edge(null,null,100),new Edge(null,null,10),new Edge(null,null,41),new Edge(null,null,20),new Edge(null,null,12),new Edge(null,null,14)};
		MinHeap<Edge> heap = new MinHeap<Edge>(edgeArray);
		
		for(int i=0;i<edgeArray.length;i++) {
			System.out.println(heap.getSmallest().weight);
		}
	}

}
