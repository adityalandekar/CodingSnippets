
public class Stack {
	
	private int size;
	private String[] array;
	private int top;
	
	public Stack(int stackSize) {
		size = stackSize;
		array = new String[stackSize];
		top = -1;
	}
	
	public void push(String element) {
		if(top < size) {
			top++;
			array[top] = element;
		}
		
		else
			System.out.println("Stack full");
	}
	
	public String pop() {
		if(top < 0) {
			return null;
		}
		
		else
			return array[top--];
	}
	
	public int getFilledSize() {
		return top + 1;
	}
	
	
	public String peek() {
		return array[top];
	}
}
