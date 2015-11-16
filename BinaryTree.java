public class BinaryTree {

	Node root;

	class Node {
		int data;
		Node leftNode;
		Node rightNode;

		Node(int data) {
			this.data = data;
			leftNode = null;
			rightNode = null;
		}
	}

	public BinaryTree() {
		root = null;
	}

	public void preOrderTraversal(Node currentNode) {
		
		if(currentNode != null) {
			System.out.println(currentNode.data);
			
			preOrderTraversal(currentNode.leftNode);
			
			preOrderTraversal(currentNode.rightNode);
		}
	}

	public void postOrderTraversal(Node currentNode) {

		if(currentNode != null) {
			postOrderTraversal(currentNode.leftNode);
			
			postOrderTraversal(currentNode.rightNode);
			
			System.out.println(currentNode.data);
		}
		
	}

	public void inOrderTraversal(Node currentNode) {

		if (currentNode != null) {
			inOrderTraversal(currentNode.leftNode);

			System.out.println(currentNode.data);

			inOrderTraversal(currentNode.rightNode);
		}

	}
	
	public Node findNode(int data) {
		
		Node currentNode = root;
		
		while(currentNode.data != data) {
			
			if(data < currentNode.data) {
				currentNode = currentNode.leftNode;
			}
			
			else {
				currentNode = currentNode.rightNode;
			}
			
			if(currentNode == null) {
				return null;
			}
			
		}
		
		return currentNode;
		
	}

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		}

		else {

			Node currentNode = root;

			while (true) {

				Node parent = currentNode;

				if (data < currentNode.data) {

					currentNode = currentNode.leftNode;

					if (currentNode == null) {
						parent.leftNode = newNode;
						return;
					}

				}

				else {

					currentNode = currentNode.rightNode;

					if (currentNode == null) {
						parent.rightNode = newNode;
						return;
					}

				}

			}

		}

	}

}
