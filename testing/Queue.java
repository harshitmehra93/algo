package testing;
import testing.LinkedList;
public class Queue<k> {
	LinkedList<k> queue;
	public Queue() {
		this.queue = new LinkedList<k>();
	}
	public void enqueue(k obj) {
		this.queue.insert(obj);
		this.queue.printLinkedList();
	}
	public k dequeue() {
		return this.queue.removeFromHead();
	}
	public void printQueue() {
		if(this.queue.head==null) {
			System.out.print("Queue is empty");
		}else {
			System.out.print("Queue start :: ");
			this.queue.printLinkedList();
			System.out.print(" :: Queue end");

		}
	}
	public boolean isQueueEmpty() {
		if(this.queue.head==null) {
			return true;
		}else {
			return false;
		}
	}
}
