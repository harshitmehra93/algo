package testing;
import testing.LinkedListNode;
public class LinkedList<k> {
	LinkedListNode<k> head,tail;
	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public LinkedList(k e1) {
		this.head=new LinkedListNode<k>(e1);
		this.tail=this.head;
	}
	public void insert(k e1) {
		if(this.head==null) {
			this.head=new LinkedListNode<k>(e1);
			this.tail=this.head;
			return;
		}
		LinkedListNode<k> ptr = this.head;
		while(ptr.next!=null) {
			ptr=ptr.next;
		}
		ptr.next=new LinkedListNode<k>(e1);
		this.tail=ptr.next;
	}
	public void insertAtHead(k e1) {
		if(this.head==null) {
			this.head=new LinkedListNode<k>(e1);
			this.tail=this.head;
			return;
		}
		LinkedListNode<k> temp = this.head;
		this.head=new LinkedListNode<k>(e1);
		this.head.next=temp;	
	}
	public k removeFromHead() {
		k obj = this.head.key;
		this.head=this.head.next;
		return obj;
	}
	public k removeFromTail() {
		if(this.head==null) {
			return null;
		}
		
		k obj = this.tail.key;
		
		LinkedListNode<k> ptr = this.head;
		while(ptr.next!=this.tail) {
			ptr=ptr.next;
		}
		this.tail=ptr;
		this.tail.next=null;
		return obj;
	}
	public void printLinkedList() {
		if(this.head==null) {
			System.out.print("List Empty");
		}
		else {
			LinkedListNode<k> ptr = this.head;
			while(ptr.next!=null) {
				System.out.print(ptr.key+" ");
				ptr=ptr.next;
			}
		}
	}
}
