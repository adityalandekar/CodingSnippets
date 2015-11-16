import java.util.Scanner;

public class BracketMatchingUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any bracket combination");
		Scanner in = new Scanner(System.in);

		String userInput = in.nextLine();

		String[] arr = userInput.split("");

		Stack myStack = new Stack(arr.length);

		int nOpeningCounter = 0;
		int nCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")) {
				myStack.push("(");
				nOpeningCounter++;
			}

			else {
				myStack.pop();
				if(nOpeningCounter > 0) {
					nOpeningCounter--;
					nCounter++;
				}
			}
		}
		
		System.out.println(nCounter);

		in.close();

	}

}
