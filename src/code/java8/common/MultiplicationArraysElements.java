package code.java8.common;

import java.util.Arrays;

public class MultiplicationArraysElements {

	public static void main(String[] args) {

		int[] arrays = { 1, 2, 3, 4 };
		System.out.println("Solution 1");
		Arrays.stream(arrays).map(s -> Arrays.stream(arrays).reduce(1, (x, y) -> x * y) / s)
				.forEach(System.out::println);
		
		System.out.println("Solution 2");
		Arrays.stream(arrays).map(s -> Arrays.stream(arrays).filter(x -> x != s).reduce(1, (x, y) -> x * y))
				.forEach(System.out::println);

		System.out.println("Solution 3");
		int[] array = { 1, 2, 3, 4 };

		int[] ints = new int[array.length];
		ints[0] = 1;
		for (int i = 1, p = array[0]; i < array.length; i++) {
			ints[i] = p;
			p *= array[i];
		}
		for (int ix = array.length - 1, p = array[ix--]; ix >= 0; ix--) {
			ints[ix] *= p;
			p *= array[ix];
		}

		System.out.println(Arrays.toString(ints));
		
	}

}
