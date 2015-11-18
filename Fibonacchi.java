public class Fibonacchi {

	public static void fibonacciUsingLoop(int endLimit) {

		int[] fibArray = new int[endLimit];
		fibArray[0] = 0;

		if (endLimit > 2) {

			fibArray[1] = 1;

			for (int i = 2; i < endLimit; i++) {
				fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
			}
		}

		for (int i = 0; i < fibArray.length; i++) {
			System.out.print(fibArray[i] + " ");
		}
	}
	
	
	public static int fibonacciUsingRecursion(int num) {
		
		if(num == 0) {
			return 0;
		}
		
		if(num == 1) {
			return 1;
		}
		
		else
			return fibonacciUsingRecursion(num - 2) + fibonacciUsingRecursion(num - 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacciUsingLoop(10);
		
		System.out.println("using recursion");
		System.out.println(fibonacciUsingRecursion(10));
	}

}
