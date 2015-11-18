
public class Swap {
	
	public static void changeArray(int[] arr) {
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
	}
	
	public static void changeNum(int num) {
		
		num = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println("Before swap");
		
		System.out.println(a);
		System.out.println(b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap");
		
		System.out.println(a);
		System.out.println(b);
		
		
		int[] arr = {3,4,5};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		changeArray(arr);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		int num = 5;
		changeNum(num);
		
		System.out.println(num);
		
	}

}
