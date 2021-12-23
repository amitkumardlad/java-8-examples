package code.java8.interviewtask;

public class SwapNumber {

	public static void main(String[] args) {
		// First solution
		int a = 7;
		int b = 3;
		System.out.println("A::" + a);
		System.out.println("B::" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("A::" + a);
		System.out.println("B::" + b);
		
		//Second solution
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("A::" + a);
		System.out.println("B::" + b);
	}

}
