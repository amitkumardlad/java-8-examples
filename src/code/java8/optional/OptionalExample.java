package code.java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");

		Optional<String> optionalIsbn = books.entrySet().stream().filter(e -> "Effective Java".equals(e.getValue()))
				.map(Map.Entry::getKey).findFirst();

		System.out.println("optionalIsbn::" + "978-0134685991".equals(optionalIsbn.get()));

	}

}
