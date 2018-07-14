
public class HeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		int[] array = {2,8,6,1,10,15,3,12,11};
		
		System.out.println("==================================");
		heap.heapSort(array);
		for(int i : heap.array) {
			System.out.println(i);
		}
	}

}
