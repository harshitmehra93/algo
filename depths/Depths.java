package depths;

import java.util.Iterator;
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
		LinkedList<LinkedList<BinaryTreeNode<Integer>>> listOfNodes = new LinkedList<LinkedList<BinaryTreeNode<Integer>>>();
		for(int i=0;i<tree.maxDepth(tree.root);i++) {
			listOfNodes.add(new LinkedList<BinaryTreeNode<Integer>>());
		}
		tree.listOfDepths(listOfNodes);
		
		Iterator<LinkedList<BinaryTreeNode<Integer>>> it = listOfNodes.iterator();
		while(it.hasNext()) {
			Iterator<BinaryTreeNode<Integer>> it2 = it.next().iterator();
			while(it2.hasNext()) {
				System.out.print(it2.next().data+"  ");
			}
			System.out.println();
		}
		
	}

}
