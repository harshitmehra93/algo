package finalprep;

import java.util.ArrayList;
import java.util.Iterator;

public class Heap {
	int size;
	int heap_size;
	ArrayList<Vertex> array = new ArrayList<Vertex>();
	public Heap() {
		this.size=0;
		this.heap_size=0;
	}
	public void add(Vertex e) {
		array.add(e);
		System.out.println(e+" heap size:"+heap_size);
		heap_size++;
	}
	public void buildMinHeap() {
		// TODO Auto-generated method stub
		for(int i=heap_size/2-1;i>=0;i--) {
			minHeapify(i);
		}
	}
	private void minHeapify(int i) {
		// TODO Auto-generated method stub
		int left=left(i);
		int right=right(i);
		//System.out.println("Max Heapify ======="+" i="+array.get(i)+" left="+left+" right="+right);
		int smallest=i;
		if(left<heap_size&&array.get(left).compareTo(array.get(smallest))==-1) {
			smallest=left;
		}
		if(right<heap_size&&array.get(right).compareTo(array.get(smallest))==-1) {
			smallest=right;
		}
		if(smallest!=i) {
			//System.out.println("Swapped====largest="+largest+"=value="+array.get(largest)+"=====i="+i+"=value="+array.get(i));
			Vertex tmp=array.get(i);
			array.set(i, array.get(smallest));
			array.set(smallest,tmp);
			minHeapify(smallest);
		}
	}
	private int right(int i) {
		// TODO Auto-generated method stub
		return 2*i+2;
	}
	private int left(int i) {
		// TODO Auto-generated method stub
		return 2*i+1;
	}
	public Vertex getMin() {
		if(heap_size<1){
			return null;
		}
		Vertex tmp=array.get(0);
		array.set(0, array.get(heap_size-1));
		array.remove(heap_size-1);
		heap_size--;
		minHeapify(0);
		return tmp;
	}
	public boolean isEmpty() {
		return heap_size==0;
	}
	public void print() {
		Iterator<Vertex> it = array.iterator();
		while(it.hasNext()) {
			Vertex u = it.next();
			System.out.print(u+" d="+u.dist+" ");
		}
		System.out.println();
	}
}
