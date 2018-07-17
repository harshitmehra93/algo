package commonancestor;

public class BinaryTree {
	BinaryTreeNode root;
	public void addNode(int data) {
		BinaryTreeNode node = new BinaryTreeNode(data);
		if(this.root==null) {
			this.root=node;
			return;
		}
		BinaryTreeNode tmp = this.root,prev=null;
		while(tmp!=null) {
			prev=tmp;
			if(tmp.compareTo(node)==1) {
				tmp=tmp.left;
			}else {
				tmp=tmp.right;
			}
		}
		node.parent=prev;
		if(prev.compareTo(node)==1) {
			prev.left=node;
		}else {
			prev.right=node;
		}
	}
	public void addNode(BinaryTreeNode node) {
		if(this.root==null) {
			this.root=node;
			return;
		}
		BinaryTreeNode tmp = this.root,prev=null;
		while(tmp!=null) {
			prev=tmp;
			if(tmp.compareTo(node)==1) {
				tmp=tmp.left;
			}else {
				tmp=tmp.right;
			}
		}
		node.parent=prev;
		if(prev.compareTo(node)==1) {
			prev.left=node;
		}else {
			prev.right=node;
		}
	}
}
