package arrays;

public class Heap {
	int size;
	int array_size;
	int[] array;
	
	public int left(int i) {
		return 2*i+1;	
	}
	
	public int right(int i) {
		return 2*i+2;
	}
	public int parent(int i) {
		if(i%2==0) {
			return i/2-1;
		}else {
			return i/2;
		}
	}
	public void maxHeapify(int i) {
		//System.out.println("=========MaxHeapify running on "+i);
		int left=this.left(i);
		int right=this.right(i);
		int largest=i;
		if((this.size>left)&&(this.array[i]<this.array[left])) {
			largest=left;
		}
		if((this.size>right)&&(this.array[largest]<this.array[right])) {
			largest=right;
		}
		if(largest!=i) {
			int tmp=this.array[i];
			this.array[i]=this.array[largest];
			this.array[largest]=tmp;
			//System.out.println("===Recurse : replaced"+this.array[i]+"  "+this.array[largest]);
			this.maxHeapify(largest);
		}
	}
	public void buildMaxHeap(int[] array) {
		this.array_size=50;
		this.array = new int[50];
		for(int i=0;i<array.length;i++) {
			this.array[i]=array[i];
		}
		this.size=array.length;
		for(int i=this.size/2-1;i>=0;i--) {
			this.maxHeapify(i);
		}
	}
	public int getLargest() {
		int max = this.array[0];
		this.size--;
		this.array[0]=this.array[this.size];
		this.array[this.size]=max;
		this.maxHeapify(0);
		return max;
	}
	// ==============Min=============
	public void minHeapify(int i) {
		//System.out.println("=========MinHeapify running on "+i);
		int left=this.left(i);
		int right=this.right(i);
		int smallest=i;
		if((this.size>left)&&(this.array[i]>this.array[left])) {
			smallest=left;
		}
		if((this.size>right)&&(this.array[smallest]>this.array[right])) {
			smallest=right;
		}
		if(smallest!=i) {
			int tmp=this.array[i];
			this.array[i]=this.array[smallest];
			this.array[smallest]=tmp;
			/*System.out.println("===Recurse : replaced"+this.array[i]+"  "+this.array[smallest]);
			System.out.println("resultant");
			for(int j=0;j<this.size;j++) {
				System.out.print(this.array[j]+"  ");
			}
			System.out.println("=========");*/
			this.minHeapify(smallest);
		}
	}
	public void buildMinHeap(int[] array) {
		this.array=array;
		this.size=array.length;
		for(int i=this.size/2-1;i>=0;i--) {
			this.minHeapify(i);
		}
	}
	public int getSmallest() {
		int min = this.array[0];
		this.size--;
		this.array[0]=this.array[this.size];
		this.array[this.size]=min;
		this.minHeapify(0);
		return min;
	}
	// for ascending order
	public void heapSort() {
		int size = this.size;
		for(int i=0;i<size;i++) {
			this.getLargest();
		}
	}
	// for descending order
	public void heapSort2() {
		int size = this.size;
		for(int i=0;i<size;i++) {
			this.getSmallest();
		}
	}
	public void insertMax(int data) {
		this.array[this.size]=data;
		this.size++;
		for(int i=this.size-1;i>0;) {
			if(this.array[i]>this.array[this.parent(i)]) {
				int tmp=this.array[i];
				this.array[i]=this.array[this.parent(i)];
				this.array[this.parent(i)]=tmp;
				i=this.parent(i);
			}else {
				break;
			}
		}
		
	}
}
