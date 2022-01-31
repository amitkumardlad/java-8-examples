package code.java8.interviewtask;

public class ReverseStringWithoutTemp {

	public static void main(String[] args) {
		
		System.out.println(getRemainder(50, 6));
		String a="Amitkumar Lad";
		char str[]= a.toCharArray();
		int start=0;
		int n=a.length();
		int end=n-1;
		while(start < end) {
			str[start]^=str[end];
			str[end]^=str[start];
			str[start]^=str[end];
			end--;
			start++;
		}
		for(int i=0; i< n; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}

	
	static int getRemainder(int num, int divisor)
	{
		return (num - divisor * (num / divisor));
	}

	
}
