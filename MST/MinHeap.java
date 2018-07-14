package MST;

public class MinHeap<E extends Comparable> {
	E[] array;
	int size;
	int heapSize;
	
	public MinHeap(E[] array) {
		this.array=array;
		this.size=array.length;
		this.heapSize=array.length;
		this.buildMinHeap();
	}
	public MinHeap() {
		this.size=0;
		this.heapSize=0;
	}
	
	private int left(int i) {
		return i*2+1;
	}

	private int right(int i) {
		return i*2+2;
	}
	
	private int parent(int i) {
		if(i%2==0) {
			return i/2-1;
		}else {
			return i/2;
		}
	}
	
	private void buildMinHeap() {
		for(int j=this.size/2-1;j>=0;j--) {
			//System.out.println("========minHeapify: "+j+"=========");
			this.minHeapify(j);
		}
	}
	
	private void minHeapify(int i) {
		//System.out.println("====recurse : "+i);
		int left=this.left(i),right=this.right(i),smallest=i;
		if((left<this.heapSize)&&(this.array[i].compareTo(this.array[left])!=-1)){
			smallest=left;
		}
		if((right<this.heapSize)&&(this.array[smallest].compareTo(this.array[right])!=-1)) {
			smallest=right;
		}
		if(smallest!=i) {
			//System.out.println("==swapped : "+this.array[i]+" "+this.array[smallest]);
			
			E tmp = this.array[smallest];
			this.array[smallest]=this.array[i];
			this.array[i]=tmp;
			//this.printArray();
			this.minHeapify(smallest);
		}
	}
	public void printArray() {
		System.out.print("Array :: ");
		for(int i=0;i<this.size;i++) {
			System.out.print(this.array[i]+" ");
		}
		System.out.println(" ");
	}
	public E getSmallest() {
		if(this.heapSize==0){
			return null;
		}
		E min=this.array[0];
		this.heapSize--;
		this.array[0]=this.array[this.heapSize];
		this.array[this.heapSize]=min;
		this.minHeapify(0);
		return min;
	}
	public boolean isEmpty() {
		return this.heapSize==0;
	}
}
