package arrays;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(1);
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());

	}

}
