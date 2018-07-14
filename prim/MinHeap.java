package prim;
import java.util.ArrayList;
public class MinHeap<E extends Comparable> {
	int size;
	int heapSize;
	E[] list;
	public MinHeap(E[] list) {
		this.size=list.length;
		this.heapSize=list.length;
		this.list= list;
		this.buildMinHeap();
	}
	public void buildMinHeap() {
		for(int i=this.size/2-1;i>=0;i--) {
			//System.out.println("========minHeapify: "+i+"=========");
			this.minHeapify(i);
		}
	}
	public void minHeapify(int i) {
		// TODO Auto-generated method stub
		//System.out.println("====recurse : "+i);
		int left=this.left(i), right=this.right(i);
		int smallest=i;
		if((left<this.heapSize)&&(this.list[left].compareTo(this.list[i])==-1)) {
			smallest=left;
		}
		if((right<this.heapSize)&&(this.list[right].compareTo(this.list[smallest])==-1)) {
			smallest=right;
		}
		if(smallest!=i) {
			//System.out.println("==swapped : "+this.list[i]+" "+this.list[smallest]);
			E tmp = this.list[smallest];
			this.list[smallest]=this.list[i];
			this.list[i]=tmp;
			this.minHeapify(smallest);
		}
	}
	private int left(int i) {
		return 2*i+1;
	}
	private int right(int i){
		return 2*i+2;
	}
	private int parent(int i) {
		if(i%2==0) {
			return i/2-1;
		}else {
			return i/1;
		}
	}
	public void printArray() {
		System.out.print("Array :: ");
		for(int i=0;i<this.size;i++) {
			System.out.print(this.list[i]+" ");
		}
		System.out.println(" ");
	}
	
	public E getSmallest() {
		E min = this.list[0];
		this.heapSize--;
		this.list[0]=this.list[this.heapSize];
		this.list[this.heapSize]=min;
		this.minHeapify(0);
		return min;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.heapSize==0;
	}
	public boolean containsKey(E obj) {
		int i=0;
		E node = this.findKey(obj,0);
		//System.out.println(node);
		if(node==null) {
			return false;
		}else {
			return true;
		}
	}
	public E findKey(E obj, int i) {
		if(obj.compareTo(this.list[i])==0) {
			return this.list[i];
		}else if(obj.compareTo(this.list[i])==-1) {
			return null;
		}else if(obj.compareTo(this.list[i])==1) {
			int left=this.left(i), right=this.right(i);
			E searchLeft=null,searchRight=null;
			if(left<this.heapSize) {
				searchLeft=findKey(obj,this.left(i));
			}
			if(right<this.heapSize) {
				searchRight=findKey(obj,this.right(i));
			}
			if(searchLeft!=null) {
				return searchLeft;
			}
			if(searchRight!=null) {
				return searchRight;
			}
			return null;
		}
		return null;
	}
}
