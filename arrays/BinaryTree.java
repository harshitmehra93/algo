package arrays;
import arrays.BinaryTreeNode;
import arrays.Queue;
import java.util.ArrayList;

public class BinaryTree {
	protected BinaryTreeNode root;
	protected ArrayList<Integer> data;
	public BinaryTree(int data) {
		this.root = new BinaryTreeNode(data);
		this.data = null;
	}
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	public BinaryTreeNode search(int e1) {
		if(this.root==null) {
			return null;
		}
		BinaryTreeNode node = this.root;
		while(node!=null) {
			System.out.println("Iteration");
			if(node.data==e1) {
				return node;
			}else if(node.data<e1) {
				node=node.right;
			}else if(node.data>e1) {
				node=node.left;
			}
		}
		return null;
	}
	public void add(int data) {
		if(this.root==null) {
			this.root = new BinaryTreeNode(data);
			return;
		}
		BinaryTreeNode node = this.root,prev=null;
		while(node!=null) {
			if(node.data>data) {
				prev=node;
				node=node.left;
			}else if(node.data<data) {
				prev=node;
				node=node.right;
			}
		}
		if(prev.data<data) {
			prev.right=new BinaryTreeNode(data);
		}else {
			prev.left=new BinaryTreeNode(data);
		}
	}
	public void BreathFirstTraversal() {
		if(this.root==null) {
			return;
		}
		Queue<BinaryTreeNode> queue = new Queue<BinaryTreeNode>();
		queue.enqueue(this.root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode node = queue.dequeue();
			if(node==null) {
				break;
			}
			this.visit(node);
			queue.enqueue(node.left);
			queue.enqueue(node.right);
		}
	}
	private void visit(BinaryTreeNode node) {
		// TODO Auto-generated method stub
		System.out.println(node.data);
		
	}
	public void preOrder(BinaryTreeNode node) {
		if(node==null) {
			return;
		}
		this.visit(node);
		this.preOrder(node.left);
		this.preOrder(node.right);
	}
	public void inOrder(BinaryTreeNode node) {
		if(node==null) {
			return;
		}
		this.inOrder(node.left);
		this.visit(node);
		this.inOrder(node.right);
	}
	public void postOrder(BinaryTreeNode node) {
		if(node==null) {
			return;
		}
		
		this.postOrder(node.left);
		this.postOrder(node.right);
		this.visit(node);
	}
	private void balance(ArrayList<Integer> data, int first, int last) {
		if(first<=last) {
			int middle = (first+last)/2;
			this.add(data.get(middle));
			this.balance(data, first, (middle-1));
			this.balance(data,(middle+1),last);
		}
	}
	public void balanceTree() {
		this.data = new ArrayList<Integer>();
		this.inOrderToArray(this.root);
		this.root=null;
		this.balance(this.data,0 , (this.data.size()-1));
	}
	private void inOrderToArray(BinaryTreeNode node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
		this.inOrderToArray(node.left);
		this.data.add(node.data);
		this.inOrderToArray(node.right);
	}
	public void delete(int data) {
		
		if(this.root==null) {
			return;
		}
		BinaryTreeNode node = this.root,prev=null;
		while(node!=null) {
			System.out.println("Iteration");
			if(node.data==data) {
				System.out.println("found");
				break;
			}else if(node.data<data) {
				prev=node;
				node=node.right;
			}else if(node.data>data) {
				prev=node;
				node=node.left;
			}
		}
		if(node==null) {
			return;
		}
		//System.out.println(prev.data+"  "+node.data);
		
		BinaryTreeNode nodeToDelete = node;
		if((nodeToDelete.left==null)&&(nodeToDelete.right==null)) {
			System.out.println("1");
			if(prev==null) {
				this.root=null;
			}else if(prev.data<nodeToDelete.data) {
				prev.right=null;
			}else {
				prev.left=null;
			}
		}else if((nodeToDelete.left!=null)&&(nodeToDelete.right==null)) {
			System.out.println("12");
			
			if(prev==null) {
				this.root=nodeToDelete.left;
			}else if(prev.data<nodeToDelete.data) {
				prev.right=nodeToDelete.left;
			}else {
				prev.left=nodeToDelete.left;
			}
		}else if((nodeToDelete.left==null)&&(nodeToDelete.right!=null)) {
			System.out.println("13");
			if(prev==null) {
				this.root=nodeToDelete.right;
			}else if(prev.data<nodeToDelete.data) {
				prev.right=nodeToDelete.right;
			}else {
				prev.left=nodeToDelete.right;
			}
		}else if((nodeToDelete.left!=null)&&(nodeToDelete.right!=null)) {
			System.out.println("14");
			node=node.left;
			while(node.right!=null) {
				node=node.right;
			}
			
			if(prev==null) {
				this.root=nodeToDelete.left;
			}else if(prev.data<nodeToDelete.left.data) {
				prev.right=nodeToDelete.left;
			}else {
				prev.left=nodeToDelete.left;
			}
			
			node.right=nodeToDelete.right;
		}
		
	}
}
