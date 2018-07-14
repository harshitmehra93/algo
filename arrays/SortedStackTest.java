package arrays;
import arrays.SortedStack;
public class SortedStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedStack stack = new SortedStack();
		stack.push(1);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);
		stack.push(10);
		stack.push(3);
		stack.push(6);
		stack.push(8);
		stack.push(2);
		
		while(stack.isEmpty()!=true) {
			System.out.println(stack.pop());
		}
	}

}
