package arrays;
import java.util.*;
import arrays.StackOverFlowException;
import arrays.StackUnderFlowException;
public class StackTest {
	private static int threshold=10;
	int size;
	LinkedList<Integer> list;
	public StackTest() {
		this.list=new LinkedList<Integer>();
		this.size=0;
	}
	public void push(int data) throws StackOverFlowException{
		if(this.size<this.threshold) {
			list.add(data);
			this.size++;
		}else {
			throw new StackOverFlowException();
		}
	}
	public Integer pop() throws StackUnderFlowException{
		if(this.size==0) {
			throw new StackUnderFlowException();
		}else {
			this.size--;
			return this.list.removeLast();
			
		}
	}
}
