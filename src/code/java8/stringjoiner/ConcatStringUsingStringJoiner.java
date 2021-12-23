package code.java8.stringjoiner;

import java.util.StringJoiner;

public class ConcatStringUsingStringJoiner {

	public static void main(String[] args) {
		System.out.println("\nString Joiner examples:");
		StringJoiner strJoinner = new StringJoiner(",");
		strJoinner.add("Amit");
		strJoinner.add("kumar");
		strJoinner.add("Dalpatbhai");
		strJoinner.add("Lad");

		System.out.println(strJoinner);

		StringJoiner strJoinner2 = new StringJoiner(":", "[", "]");
		strJoinner2.add("Amit");
		strJoinner2.add("kumar");
		strJoinner2.add("Dalpatbhai");
		strJoinner2.add("Lad");

		System.out.println(strJoinner2);

	}

}
