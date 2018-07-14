package arrays;
import arrays.BinaryTree;
public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// see page 217
		BinaryTree tree = new BinaryTree();
		tree.add(15);
		tree.add(4);
		tree.add(1);
		tree.add(20);
		tree.add(16);
		tree.add(25);
		tree.add(6);
		/*tree.add(1);
		tree.add(12);
		tree.add(13);
		tree.add(14);
		tree.add(15);
		tree.add(16);
		tree.add(17);
		tree.add(18);
		tree.add(19);
		tree.add(20);
		tree.add(22);
		tree.add(23);*/
		//tree.balanceTree();
		
		
		//tree.delete(6);
		//tree.delete(4);
		//tree.delete(20);
		//tree.search(16);
		//tree.search(1);
		//System.out.print(tree.search(6).data);
		
		tree.delete(15);
		//System.out.print(tree.search(15));
		//System.out.println(tree.search(25).data);
		tree.delete(1);
		tree.delete(6);
		tree.delete(4);
		//System.out.println(tree.search(25).data);
		System.out.println("======");
		tree.inOrder(tree.root);
	}

}
