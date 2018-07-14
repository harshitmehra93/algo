package testing;
import testing.LinkedList;;
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.insert(1);
		llist.insert(12);
		llist.insert(13);
		llist.insert(14);
		llist.insert(15);
		llist.insert(16);
		llist.insert(17);
		llist.insert(18);
		llist.printLinkedList();
		System.out.println();
		System.out.println("insert at head");
		llist.insertAtHead(0);
		llist.printLinkedList();
		
		System.out.println();
		System.out.println("remove from head");
		llist.removeFromHead();
		llist.printLinkedList();
		
		System.out.println();
		System.out.println("remove from tail");
		llist.removeFromTail();
		llist.printLinkedList();
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
