package commonancestor;

public class CommonAncestor {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.addNode(15);
		tree.addNode(4);

		tree.addNode(20);
		
		BinaryTreeNode oneSix = new BinaryTreeNode(16);

		tree.addNode(oneSix);
		tree.addNode(25);
		tree.addNode(1);
		
		BinaryTreeNode six = new BinaryTreeNode(6);
		tree.addNode(six);
		tree.addNode(10);
		
		CommonAncestor ca = new CommonAncestor();
		System.out.println(ca.findCommonAncestor(six,oneSix));
	}

	private BinaryTreeNode findCommonAncestor(BinaryTreeNode node1, BinaryTreeNode node2) {
		// TODO Auto-generated method stub
		if(node1.parent==null) {
			if(this.preOrderSearch(node1,node2)) {
				return node1;
			}
		}
		System.out.println(node1);

		if(this.preOrderSearch(node1,node2)) {
			return node1;
		}
		BinaryTreeNode parent = node1.parent;
		boolean found=false;
		while(parent!=null) {
			System.out.println(parent);
			found=false;
			if(parent.compareTo(node1)==1) {
				found=this.preOrderSearch(parent.right,node2);
			}else {
				found=this.preOrderSearch(parent.left,node2);
			}
			if(found) {
				return parent;
			}else {
				parent=parent.parent;
			}
		}
		return null;
	}

	private boolean preOrderSearch(BinaryTreeNode node, BinaryTreeNode key) {
		// TODO Auto-generated method stub
		if(node==null) {
			return false;
		}
		if(node==key) {
			return true;
		}else {
			return this.preOrderSearch(node.left, key)||this.preOrderSearch(node.right, key);
		}
	}
}
