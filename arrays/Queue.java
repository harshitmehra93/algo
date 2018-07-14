package arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue<E> {
	int size;
	LinkedList<E> list;
	public Queue() {
		this.size=0;
		this.list=new LinkedList<E>();
	}
	public void enqueue(E node) {
		this.size++;
		this.list.addFirst(node);
	}
	public E dequeue() {
		this.size--;
		return list.removeLast();
	}
	public boolean isEmpty() {
		return this.size==0;
	}
	public void printQueue() {
		Iterator it = this.list.iterator();
		System.out.print("Queue start :: ");
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println(" :: Queue end");
	}
}
