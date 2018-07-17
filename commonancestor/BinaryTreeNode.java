package commonancestor;

public class BinaryTreeNode implements Comparable {
	Integer data;
	BinaryTreeNode left,right,parent;
	BinaryTreeNode(int data){
		this.data=data;
	}
	@Override
	public int compareTo(Object obj) {
		BinaryTreeNode node = (BinaryTreeNode)obj;
		return this.data.compareTo(node.data);
	}
	public String toString() {
		return this.data.toString();
	}
}
