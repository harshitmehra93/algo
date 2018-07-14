package arrays;
import arrays.SetOfStacks;
public class TestSetOfStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOfStacks stack = new SetOfStacks();
		
		for(int i=0;i<10;i++) {
			stack.push(1);
		}
		for(int i=0;i<10;i++) {
			stack.push(2);
		}
		for(int i=0;i<10;i++) {
			stack.push(3);
		}
		for(int i=0;i<10;i++) {
			stack.push(4);
		}
		for(int i=0;i<10;i++) {
			stack.push(5);
		}
		for(int i=0;i<10;i++) {
			stack.push(6);
		}
		for(int i=0;i<10;i++) {
			stack.push(7);
		}
		for(int i=0;i<10;i++) {
			stack.push(8);
		}
		for(int i=0;i<10;i++) {
			stack.push(9);
		}
		for(int i=0;i<10;i++) {
			stack.push(10);
		}
		
		System.out.println("======test pop=====");
		for(int i=0;i<11;i++) {
			System.out.println(stack.pop());
		}
		for(int i=0;i<12;i++) {
			System.out.println(stack.pop());
		}
		System.out.println("======test pop=====");
		
		
		System.out.println("======test pop Index=====");
		for(int i=0;i<11;i++) {
			System.out.println(stack.popIndex(5));
		}
		for(int i=0;i<10;i++) {
			System.out.println(stack.popIndex(4));
		}
		System.out.println("======test pop Index=====");
		for(int i=0;i<56;i++) {
			System.out.println(stack.pop());
		}
		
		System.out.println("=====test again====");
		//test again
		for(int i=0;i<10;i++) {
			stack.push(1);
		}
		for(int i=0;i<10;i++) {
			System.out.println(stack.popIndex(1));
		}
		
		stack.push(1);
	}

}
