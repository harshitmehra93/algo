package arrays;
import arrays.Heap;
public class HeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,8,6,10,15,3,12,11,9,13};
		
		Heap heap = new Heap();
		heap.buildMaxHeap(test);
		System.out.println("Largest = "+heap.getLargest());
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		
		System.out.println("======");
		heap.insertMax(16);
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		System.out.println("======");
		heap.insertMax(19);
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		System.out.println("======");
		heap.insertMax(182);
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		System.out.println("======");
		heap.insertMax(0);
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		System.out.println("======sorted");
		heap.heapSort();
		for(int i=0;i<heap.array_size;i++) {
			System.out.println(heap.array[i]);
		}
		/*
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		System.out.println("Largest = "+heap.getLargest());
		
		/*
		heap.buildMinHeap(test);
		System.out.println("==========Min HEAP Made=========");
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		
		System.out.println("smallest = "+heap.getSmallest());
		
		for(int i=0;i<heap.size;i++) {
			System.out.println(heap.array[i]);
		}
		System.out.println("smallest = "+heap.getSmallest());
		System.out.println("smallest = "+heap.getSmallest());
		System.out.println("smallest = "+heap.getSmallest());
		System.out.println("smallest = "+heap.getSmallest());
		*/
		
	}

}
