package balanced;

public class BinaryTree<E extends Comparable> {
	BinaryTreeNode<E> root;
	public void addNode(E data) {
		BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);
		if(this.root==null) {
			this.root=node;
			return;
		}
		BinaryTreeNode<E> tmp = this.root,prev=null;
		while(tmp!=null) {
			prev=tmp;
			if(tmp.compareTo(node)==-1) {
				tmp=tmp.right;
			}else {
				tmp=tmp.left;
			}
		}
		if(prev.compareTo(node)==-1) {
			node.parent=prev;
			prev.right=node;
		}else {
			node.parent=prev;
			prev.left=node;
		}
	}
	public boolean checkBalanced() {
		if(this.checkDepths(this.root)==-1) {
			return false;
		}else {
			return true;
		}
	}
	private int checkDepths(BinaryTreeNode<E> node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return 0;
		}
		int left = this.checkDepths(node.left);
		int right = this.checkDepths(node.right);
		if(left==-1||right==-1) {
			return -1;
		}
		if(Math.abs(left-right)>1) {
			return -1;
		}else {
			return 1+Math.max(left,right);
		}
	}
	public boolean checkBST(BinaryTreeNode<E> node) {
	
		if(node==null) {
			return true;
		}
		//System.out.println(node.data);
		BinaryTreeNode<E> left = node.left;
		BinaryTreeNode<E> right = node.right;
		if(node.left==null&&node.right==null) {
			return true;
		}
		if(node.left==null&&node.right!=null) {
			if(node.compareTo(node.right)!=-1) {
				return false;
			}else {
				return this.checkBST(node.right);
			}
		}
		if(node.right==null&&node.left!=null) {
			if(node.compareTo(node.left)!=1) {
				return false;
			}else {
				return this.checkBST(node.left);
			}
		}
		if((node.compareTo(node.right)!=-1)&&(node.compareTo(node.left)!=1)) {
			return false;
		}else {
			return this.checkBST(node.left)&&this.checkBST(node.right);
		}

	}
	public E getSuccessor(BinaryTreeNode<E> node) {
		if(!this.checkBST(this.root)) {
			return null;
		}
		BinaryTreeNode<E> tmp = node,prev=null;
		if(node.right!=null) {
			tmp=tmp.right;
			while(tmp!=null) {
				prev=tmp;
				tmp=tmp.left;
			}
			return prev.data;
		}else {
			return node.parent.data;
		}
	}
}
