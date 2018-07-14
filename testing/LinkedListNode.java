package testing;

public class LinkedListNode<k> {
	k key;
	LinkedListNode next;
	public LinkedListNode() {
		this.key = (k) null;
		this.next=null;
	}
	public LinkedListNode(k key) {
		this.key = key;
		this.next=null;
	}
	public LinkedListNode(k key,LinkedListNode next) {
		this.key = key;
		this.next=next;
	}
}
