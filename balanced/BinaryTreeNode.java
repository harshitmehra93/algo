package balanced;

public class BinaryTreeNode<E extends Comparable> implements Comparable{
	E data;
	BinaryTreeNode<E> left,right,parent;
	BinaryTreeNode(E data){
		this.data=data;
	}
	@Override
	public int compareTo(Object o) {
		BinaryTreeNode<E> node = (BinaryTreeNode<E>)o;
		return this.data.compareTo(node.data);
	}
}
