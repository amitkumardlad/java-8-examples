package code.java8.interviewtask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonDuplicateInArray {

	public static void main(String[] args) {
		// find non duplicate value from array
		int ids[] = { 40, 33, 34, 55, 33, 55, 40, 11, 40, 88 };
		List<Integer> nonduplicates = Arrays.stream(ids).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Non Duplicate Value::" + nonduplicates);

	}

}
