package testing;

public class BinaryTreeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.insertNode(0);
		tree.insertNode(14);
		tree.insertNode(2);
		tree.insertNode(3);
		tree.insertNode(46);
		tree.insertNode(5);
		tree.insertNode(6);
		tree.insertNode(77);
		tree.insertNode(8);
		tree.insertNode(91);
		
		tree.BreadthFirstPrint();
	}

}
