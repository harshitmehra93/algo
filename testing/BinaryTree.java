package testing;
import testing.BinaryTreeNode;
public class BinaryTree {
	BinaryTreeNode root;
	public BinaryTree(BinaryTreeNode root) {
		this.root=root;
	}
	public BinaryTree() {
		this.root=null;
	}
	public void insertNode(int e1) {
		if(this.root==null) {
			this.root=new BinaryTreeNode(e1);
			return;
		}
		BinaryTreeNode ptr = this.root,prev=null;
		while(ptr!=null) {
			if(e1<ptr.key) {
				prev=ptr;
				ptr=ptr.left;
			}
			else {
				prev=ptr;
				ptr=ptr.right;
			}
		}
		if(prev.key<e1) {
			prev.right=new BinaryTreeNode(e1);
		}
		if(prev.key>=e1) {
			prev.left=new BinaryTreeNode(e1);
		}
	}
	public void visit(BinaryTreeNode node) {
		System.out.print(node.key+" ");
	}
	public void BreadthFirstPrint() {
		int counter =0;
		if(this.root==null) {
			System.out.print("treeEmpty");
		}
		else {
			Queue<BinaryTreeNode> queue = new Queue<BinaryTreeNode>();
			queue.enqueue(this.root);
			BinaryTreeNode temp;
			while(queue.isQueueEmpty()!=true) {
				System.out.println();

				//queue.printQueue();
				temp = queue.dequeue();
				
				if(this.isPowerOf2(counter)) {
					System.out.println();
				}
				counter++;
				
				temp.visit();
				
				queue.enqueue(temp.left);
				queue.enqueue(temp.right);
				//queue.printQueue();
			}
		}
	}
	private boolean isPowerOf2(int counter) {
		int[] powersOf2 = {1,3,7,15,31};
		for(int i=0;i<powersOf2.length;i++) {
			if(powersOf2[i]==counter) {
				return true;
			}
		}
		return false;
	}
}
