package arrays;
import java.util.*;
import arrays.StackTest;
import arrays.StackOverFlowException;
import arrays.StackUnderFlowException;
public class SetOfStacks {
	Stack<StackTest> stackOfStacks;
	StackTest currentStack;
	int threshold;
	public SetOfStacks() {
		this.currentStack=new StackTest();
		this.stackOfStacks = new Stack<StackTest>();
		this.stackOfStacks.push(this.currentStack);
	}
	
	public void push(int data){
		try {
			this.currentStack.push(data);
		}catch(StackOverFlowException e) {
			System.out.println(e);
			this.currentStack=new StackTest();
			this.stackOfStacks.push(this.currentStack);
			this.push(data);	
		}
	}
	public Integer pop() {
		Integer result = 0;
		try {
			result = this.currentStack.pop();
		}catch(StackUnderFlowException e) {
			System.out.println(e);
			this.stackOfStacks.pop();
			this.currentStack=this.stackOfStacks.peek();
			result = this.pop();
		}
		return result;
		
	}
	
	public Integer popIndex(int i) {
		Stack<StackTest> temp = new Stack<StackTest>();
		int length = this.stackOfStacks.size();
		for(int j=0;j<length-i;j++) {
			temp.push(this.stackOfStacks.pop());
		}
		
		int result =0;
		try {
			result=this.stackOfStacks.peek().pop();
			while(temp.size()!=0) {
				//System.out.println("Original  :"+this.stackOfStacks.size());
				this.stackOfStacks.push(temp.pop());
			}
		}catch(StackUnderFlowException e) {
			this.stackOfStacks.pop();
			//System.out.println("=====size=====");
			while(temp.size()!=0) {
				//System.out.println("Original  :"+this.stackOfStacks.size());
				this.stackOfStacks.push(temp.pop());
			}
			//System.out.println("=====size=====");
			result=this.popIndex(i-1);
		}
		return result;
	}
}
