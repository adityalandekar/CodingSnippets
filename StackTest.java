
public class StackTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack myStack = new Stack(10);
		myStack.push("A");
		myStack.push("D");
		myStack.push("I");
		myStack.push("T");
		myStack.push("Y");
		myStack.push("A");

		int stackSize = myStack.getFilledSize();
		
		for(int i = 0; i < stackSize; i++) {
			System.out.println(myStack.pop());
		}
		
	}

}
