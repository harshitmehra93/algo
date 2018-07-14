/*   4,9,1,0,5,8
 *   0,1,2,3,4
 * 
 * 
 */
public class Heap {
	int heap_size;
	int size;
	int[] array;
	public Heap() {
		this.heap_size=0;
		this.size=0;
	}
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
	public void buildMaxHeap(int[] array) {
		this.array=array;
		this.heap_size=array.length;
		this.size=array.length;
		for(int i=this.size/2-1;i>=0;i--) {
			System.out.println("============"+i+"=============");
			maxHeapify(i);
		}
	}
	private void maxHeapify(int i) {
		// TODO Auto-generated method stub
		System.out.println("===MaxHapify==="+i+"===");
		int left = this.left(i);
		int right = this.right(i);
		int largest=i;
		if((left<this.heap_size)&&(this.array[i]<this.array[left])) {
			largest=left;
		}
		if((right<this.heap_size)&&(this.array[largest]<this.array[right])) {
			largest=right;
		}
		if(largest!=i) {
			int tmp = this.array[i];
			this.array[i]=this.array[largest];
			this.array[largest]=tmp;
			this.maxHeapify(largest);
		}
	}
	public int extractMax() {
		int max = this.array[0];
		this.array[0]=this.array[(this.heap_size-1)];
		this.array[(this.heap_size-1)]=max;
		this.heap_size--;
		this.maxHeapify(0);
		return max;
	}
	public int[] heapSort(int[] array) {
		this.buildMaxHeap(array);
		for(int i=0;i<this.size;i++) {
			this.extractMax();
		}
		return this.array;
	}
	
}
