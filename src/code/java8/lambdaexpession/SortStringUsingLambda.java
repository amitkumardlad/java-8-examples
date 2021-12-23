package code.java8.lambdaexpession;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortStringUsingLambda {

	public static void main(String[] args) {
		String inputLines = "XOR,Xoriant,24|Citi,Citibank,64|TechM,Tech Mahindra Ltd,17|NJ,NJ India Pvt India Ltd,55";
		System.out.println("Input String lines::"+inputLines);
		System.out.println("First Result:-");
		Arrays.stream(inputLines.split("\\|"))
	            .collect(groupingBy(s -> Integer.parseInt(s.substring(s.lastIndexOf(',')+1)), TreeMap::new, Collectors.toList()))
	            .values().stream()
	            .flatMap(line -> line.stream())
		.forEach(System.out::println);
		
		System.out.println("\nSecond Result:-");
		
		String result = Arrays.stream(inputLines.split("\\|"))
        .collect(groupingBy(s -> Integer.parseInt(s.substring(s.lastIndexOf(',')+1)), TreeMap::new, Collectors.toList()))
        .values().stream()
        .flatMap(line -> line.stream())
        .collect(toList())
        .stream().collect(Collectors.joining("|"));
		System.out.println(result);

	}

}
