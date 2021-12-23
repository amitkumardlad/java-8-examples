package code.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import code.java8.common.Person;


public class SteamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit", "Dickens", 60),
				new Person("Aron", "Finch", 42),
				new Person("Tim", "Cook", 51),
				new Person("Breat", "Lee", 45),
				new Person("Chrish", "Gayle", 39)
				);
		
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		
		long count = people.parallelStream()
		.filter(p -> p.getLastName().startsWith("D"))
		.count();
		
		System.out.println(count);
		
		Double ageAvg = people.stream()
				.collect(Collectors.averagingInt(p->p.getAge()));
		System.out.println(ageAvg);

	}

}
