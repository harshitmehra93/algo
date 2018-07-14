
public class BinaryTreeNode {
	int key;
	BinaryTreeNode left,right;
	public BinaryTreeNode() {
		this.key=0;
		this.left=null;
		this.right=null;
	}
	public BinaryTreeNode(int key) {
		this.key=key;
		this.left=null;
		this.right=null;
	}
	public BinaryTreeNode(int key, BinaryTreeNode left, BinaryTreeNode right) {
		this.key=key;
		this.left=left;
		this.right=right;
	}
}
