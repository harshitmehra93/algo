package depths;

public class BinaryTree<E extends Comparable> {
	BinaryTreeNode<E> root;
	public void addNode(E data) {
		BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);
		if(this.root==null) {
			this.root=node;
			return;
		}
		BinaryTreeNode tmp = this.root,prev=null;
		while(tmp!=null) {
			prev=tmp;
			if(tmp.compareTo(node)==-1) {
				tmp=tmp.right;
			}else if(tmp.compareTo(node)==1) {
				tmp=tmp.left;
			}
		}
		if(prev.compareTo(node)==-1) {
			prev.right=node;
		}else {
			prev.left=node;
		}
	}
	public void checkDepths(int depth,BinaryTreeNode<E> node) {
		if(node==null) {
			return;
		}
		if(node==this.root) {
			depth=0;
		}
		node.depth=depth;
		depth++;
		this.checkDepths(depth, node.left);
		this.checkDepths(depth, node.right);
	}
	public void preOrder(BinaryTreeNode<E> node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data+"  depth="+node.depth);
		this.preOrder(node.left);
		this.preOrder(node.right);
	}
	public void listOfDepths() {
		int maxDepth=this.maxDepth(this.root);
	}
	int maxDepth(BinaryTreeNode<E> node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return 0;
		}
		int left = this.maxDepth(node.left);
		int right = this.maxDepth(node.right);
		return 1+(int)Math.max(left, right);
	}
}
