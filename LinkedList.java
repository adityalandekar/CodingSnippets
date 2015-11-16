
public class LinkedList {

	Node mainNode;
	int nNodeCounter;

	class Node {
		int data;
		Node nextNode;

		Node(int data) {
			this.data = data;
			nextNode = null;
		}
	}

	LinkedList() {
		nNodeCounter = 0;
	}

	public void addNode(int data) {
		Node node = new Node(data);

		if (nNodeCounter == 0) {
			mainNode = new Node(data);
			nNodeCounter++;
		}

		else {
			Node lastNode = mainNode;
			while (lastNode.nextNode != null) {
				lastNode = lastNode.nextNode;
			}

			lastNode.nextNode = node;
			nNodeCounter++;
		}
	}

	public void addNode(int index, int data) {
		Node node = new Node(data);

		if (index == nNodeCounter) {
			addNode(data);
			return;
		}

		if (index == 1) {
			node.nextNode = mainNode;
			mainNode = node;
		}

		Node nodeBeforeIndex = mainNode;
		for (int i = 0; i < index - 2; i++) {
			nodeBeforeIndex = nodeBeforeIndex.nextNode;
		}

		Node currentNode = nodeBeforeIndex.nextNode;

		nodeBeforeIndex.nextNode = node;
		node.nextNode = currentNode;

		nNodeCounter++;
	}

	public void removeLastNode() {
		Node endNode = mainNode;
		for (int i = 0; i < nNodeCounter - 1; i++) {
			endNode = endNode.nextNode;
		}

		endNode.nextNode = null;
		nNodeCounter--;
	}

	public void removeNode(int index) {
		if (index >= nNodeCounter) {
			System.out.println("Index too large");
			return;
		}

		if (index == 1) {
			mainNode = mainNode.nextNode;
			nNodeCounter--;
			return;
		}

		if (index == nNodeCounter) {
			removeLastNode();
			return;
		}

		Node nodeBeforeIndex = mainNode;
		for (int i = 0; i < index - 2; i++) {
			nodeBeforeIndex = nodeBeforeIndex.nextNode;
		}

		Node currentNode = nodeBeforeIndex.nextNode;
		Node nextNode = currentNode.nextNode;

		nodeBeforeIndex.nextNode = nextNode;
		nNodeCounter--;
	}
	
	public void printListInReverse(Node startingNode) {
		
		if(startingNode.nextNode != null) {
			printListInReverse(startingNode.nextNode);
		}
		
		System.out.println(startingNode.data);
				
	}

	public void printListInReverse() {

		int[] array = new int[nNodeCounter];
		
		Node tempNode = mainNode;

		for (int i = 0; i < nNodeCounter; i++) {
			array[i] = tempNode.data;
			tempNode = tempNode.nextNode;
		}
		
		for(int i = nNodeCounter - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	public void printList() {

		Node tempNode = mainNode;

		for (int i = 0; i < nNodeCounter; i++) {
			System.out.println(tempNode.data);
			tempNode = tempNode.nextNode;
		}
	}
}
