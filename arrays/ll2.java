package arrays;
import java.util.*;
public class ll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(11);
		llist.add(11);
		llist.add(2);
		llist.add(1);
		/*llist.add(13);
		llist.add(14);
		llist.add(15);
		llist.add(16);
		llist.add(17);
		llist.add(18);
		llist.add(19);
		llist.add(10);
		llist.add(19);
		llist.add(18);*/
		
		boolean flag = checkPalindrome(llist);
		System.out.println(flag);
	}

	private static boolean checkPalindrome(LinkedList<Integer> llist) {
		// TODO Auto-generated method stub
		Iterator iterator = llist.iterator();
		int len = 0;
		Stack<Integer> stack = new Stack<Integer>();
		while(iterator.hasNext()) {
			stack.push((Integer) iterator.next());
			len++;
		}
		iterator = llist.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()!=stack.pop()) {
				return false;
			}
		}
		return true;
	}

}
