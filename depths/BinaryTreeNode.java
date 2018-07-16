package depths;

public class BinaryTreeNode<E extends Comparable> implements Comparable {
	E data;
	BinaryTreeNode<E> left, right;
	int depth;
	BinaryTreeNode(E data){
		this.data=data;
	}
	@Override
	public int compareTo(Object obj) {
		BinaryTreeNode node = (BinaryTreeNode)obj;
		return this.data.compareTo(node.data);
	}
}
