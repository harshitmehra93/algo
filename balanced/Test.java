package balanced;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.addNode(15);
		tree.addNode(4);
		tree.addNode(1);
		tree.addNode(20);
		tree.addNode(16);
		tree.addNode(25);
		tree.addNode(6);
		tree.addNode(10);
		
		
		System.out.println(tree.getSuccessor(tree.root));
	}

}
