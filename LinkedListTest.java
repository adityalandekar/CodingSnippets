
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		list.addNode(8);
		list.addNode(9);
		list.addNode(10);
		
		list.printList();
		
		System.out.println("");
		
		list.printListInReverse(list.mainNode);
		
		System.out.println("");
		
		list.printListInReverse();
		
		System.out.println("");
		
		list.removeNode(5);
		
		list.printList();
		
		list.removeNode(1);
		
		System.out.println("");
		
		list.printList();
		
		System.out.println("");
		
		list.addNode(1, 1);
		list.addNode(5, 5);
		
		list.printList();		
	}
}
