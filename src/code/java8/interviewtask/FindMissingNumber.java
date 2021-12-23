package code.java8.interviewtask;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int array[] = {1, 9,5,4,6,2,8,10, 3};
		int arrayLength= 10;
		int sumOfTotal = (arrayLength*(arrayLength+1))/2;
		int sumOfarray=0;
		for (int i=0; i< array.length; i++) {
			sumOfarray+=array[i];
		}
		System.out.println("Sum of sumOfTotal is "+sumOfTotal);
		System.out.println("Sum of sumOfarray is "+sumOfarray);
		System.out.println("Missing number is "+(sumOfTotal - sumOfarray));
	}

}
