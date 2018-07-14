package testing;

public class QueueTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(null);
		queue.printQueue();
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		queue.dequeue();
		queue.printQueue();
		
	}

}
