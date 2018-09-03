package finalprep;

import java.util.LinkedList;

public class Queue {
	LinkedList<Vertex> list = new LinkedList<Vertex>();
	public void enqueue(Vertex v) {
		list.addFirst(v);
	}
	public Vertex dequeue() {
		if(list.size()==0) {
			return null;
		}
		return list.removeLast();
	}
	public boolean isEmpty() {
		return list.size()==0;
	}
}
