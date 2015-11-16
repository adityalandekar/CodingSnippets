public class DoubleLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLinkedList list = new DoubleLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(10);
		
		list.printList();
		
		System.out.println();
		list.printListInReverse();
		
		list.removeLast();
		list.removeLast();
		
		System.out.println("");
		
		list.printList();
		
		list.add(6, 11);
		
		System.out.println("");
		
		list.printList();
		
	}

}
