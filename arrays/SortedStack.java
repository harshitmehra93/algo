package arrays;
import java.util.LinkedList;
import java.util.Stack;
public class SortedStack {
	LinkedList<Integer> list;
	Stack<Integer> temp;
	int size;
	public SortedStack() {
		this.list = new LinkedList<Integer>();
		this.temp = new Stack<Integer>();
		this.size=0;
	}
	
	public void push(int data) {
		this.size++;
		while(this.list.size()!=0) {
			if(data<this.list.getLast()) {
				this.temp.push(this.list.pop());
			}else {
				break;
			}
		}
		this.list.push(data);
		while(this.temp.size()!=0) {
			this.list.push(this.temp.pop());
		}
	}
	
	public Integer pop() {
		if(this.size!=0) {
			this.size--;
		}
		return this.list.removeLast();
	}
	public Integer peek() {
		return this.list.getLast();
	}
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}else {
			return false;
		}
	}
	
}
