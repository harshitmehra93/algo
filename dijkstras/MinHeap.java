package dijkstras;

public class MinHeap {
	Vertex[] array;
	int size;
	int heapSize;
	public MinHeap(Vertex[] vertices) {
		this.array=vertices;
		this.size=vertices.length;
		this.heapSize=vertices.length;
		this.buildMinHeap();
	}
	private int left(int i) {
		return 2*i+1;
	}
	private int right(int i) {
		return 2*i+2;
	}
	private int parent(int i) {
		if(i%2==0) {
			return i/2-1;
		}else {
			return i/2;
		}
	}
	public void buildMinHeap() {
		for(int i=this.size-1;i>=0;i--) {
			this.minHeapify(i);
		}
	}
	public void minHeapify(int i) {
		int left=this.left(i),right=this.right(i);
		int smallest=i;
		if(left<this.heapSize&&this.array[i].compareTo(this.array[left])>0) {
			smallest=left;
		}
		if(right<this.heapSize&&this.array[smallest].compareTo(this.array[right])>0) {
			smallest=right;
		}
		if(smallest!=i) {
			Vertex min = this.array[smallest];
			this.array[smallest]=this.array[i];
			this.array[i]=min;
			this.minHeapify(smallest);
		}
	}
	public Vertex getSmallest() {
		Vertex min = this.array[0];
		this.heapSize--;
		this.array[0]=this.array[this.heapSize];
		this.array[this.heapSize]=min;
		this.minHeapify(0);
		return min;
	}
	public boolean isEmpty() {
		return this.heapSize==0;
	}
	public boolean containsKey(Vertex v) {
		if(this.array[0].compareTo(v)==1) {
			return false;
		}else if(this.array[0].compareTo(v)==0) {
			return true;
		}else {
			return this.findKey(v,0);
		}
	}
	public boolean findKey(Vertex v, int i) {
		// TODO Auto-generated method stub
		int left = this.left(i), right= this.right(i);
		boolean flag=false;
		if(left<this.heapSize&&this.array[left].compareTo(v)==1) {
			flag=false;
		}else if(left<this.heapSize&&this.array[left].compareTo(v)==0) {
			flag=true;
		}else if(left<this.heapSize&&this.array[left].compareTo(v)==-1){
			flag=this.findKey(v, left);
		}
		if(flag==true) {
			return true;
		}
		if(right<this.heapSize&&this.array[right].compareTo(v)==1) {
			flag=false;
		}else if(right<this.heapSize&&this.array[right].compareTo(v)==0) {
			flag=true;
		}else if(right<this.heapSize&&this.array[right].compareTo(v)==-1){
			flag=this.findKey(v, right);
		}
		return flag;
	}
}
