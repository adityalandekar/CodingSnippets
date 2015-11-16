import java.io.*;

public class ReversingArray {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int sizeOfArray = 0;
		try {
			sizeOfArray = Integer.parseInt(input.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str;
		try {
			str = input.readLine();
			
			String[] arr = str.split(" ");
			
			for(int i = sizeOfArray - 1; i <= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	}
}