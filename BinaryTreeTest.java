
public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree myTree = new BinaryTree();
		
		myTree.addNode(10);
		myTree.addNode(20);
		myTree.addNode(70);
		myTree.addNode(30);
		myTree.addNode(50);
		myTree.addNode(90);
		myTree.addNode(100);
		myTree.addNode(40);

		myTree.inOrderTraversal(myTree.root);
		
		System.out.println();
		
		myTree.preOrderTraversal(myTree.root);
		
		System.out.println();
		
		myTree.postOrderTraversal(myTree.root);
		
		System.out.println();
		
		System.out.println(myTree.findNode(50).data);
		
	}

}
