package depths;

import java.util.LinkedList;

public class Depths {

	@SuppressWarnings("deprecation")
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
		
		tree.checkDepths(0,tree.root);
		tree.preOrder(tree.root);
		System.out.println("Max Depth   :"+tree.maxDepth(tree.root));
		LinkedList<BinaryTreeNode<Integer>>[] listOfNodes[] = new LinkedList<BinaryTreeNode<Integer>>[tree.maxDepth(tree.root)];
		
	}

}
