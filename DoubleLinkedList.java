public class DoubleLinkedList {

	int nodeCounter;
	Node head;
	Node tail;

	DoubleLinkedList() {
		nodeCounter = -1;
	}

	public class Node {
		int data;
		Node next;
		Node previous;

		Node(int data) {
			this.data = data;
			next = null;
			previous = null;
		}
	}

	public void append(int data) {

		Node newNode = new Node(data);

		if (nodeCounter < 0) {
			head = newNode;
			tail = newNode;
			nodeCounter++;
		}

		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			nodeCounter++;
		}
	}
	
	public void add(int index, int data) {
		
		if(index == nodeCounter) {
			append(data);
			return;
		}
		
		Node newNode = new Node(data);
		
		if(index == 0) {
			newNode.next = head;
			newNode.previous = null;
			
			head = newNode;
		}
		
		else if(index > nodeCounter/2) {
			Node nodeAfterIndex = tail;
			for(int i = nodeCounter; i > index + 1; i--) {
				nodeAfterIndex = nodeAfterIndex.previous;
			}
			
			Node nodeBeforeIndex = nodeAfterIndex.previous;
			
			nodeBeforeIndex.next = newNode;
			newNode.previous = nodeBeforeIndex;
			
			newNode.next = nodeAfterIndex;
			nodeAfterIndex.previous = newNode;
		}
		
		else {
			
			Node nodeBeforeIndex = head;
			for(int i = 0; i < index - 1; i++) {
				nodeBeforeIndex = head.next;
			}
			
			Node nodeAfterIndex = nodeBeforeIndex.next;
			
			nodeBeforeIndex.next = newNode;
			newNode.previous = nodeBeforeIndex;
			
			newNode.next = nodeAfterIndex;
			nodeAfterIndex.previous = newNode;
		}
		
		nodeCounter++;
	}

	public void removeLast() {
		Node newLastNode = tail.previous;
		newLastNode.next = null;
		tail = newLastNode;
		nodeCounter--;
	}

	public void printList() {
		Node tempNode = head;

		for (int i = 0; i <= nodeCounter; i++) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	public void printListInReverse() {
		Node tempNode = tail;
		
		for(int i = nodeCounter; i >= 0; i--) {
			System.out.println(tempNode.data);
			tempNode = tempNode.previous;
		}
	}

}
