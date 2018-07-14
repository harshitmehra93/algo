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
		if(prev.left==null) {
			prev.left=new BinaryTreeNode(e1);
		}
		else {
			prev.right=new BinaryTreeNode(e1);
		}
	}
}
