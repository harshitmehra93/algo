package arrays;
import java.util.*;
public class linkedl1 {
	public static void main(String[] args) {
		LinkedList<Integer> llist;
		while(true) {
			llist = new LinkedList<Integer>();
			llist.add(1);
			llist.add(1);
			llist.add(2);
			llist.add(3);
			llist.add(17);
			llist.add(14);
			llist.add(13);
			llist.add(9);
			llist.add(1);
			llist.add(7);
			llist.add(6);
			Iterator iterator = removeDupes(llist).iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			break;
		}
		
	}

	private static LinkedList<Integer> removeDupes(LinkedList<Integer> llist) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		Iterator iterator = llist.iterator();
		while(iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			if(map.containsKey(key)) {
				iterator.remove();
			}else {
				map.put(key, true);
			}
		}
		return llist;
	}
}
