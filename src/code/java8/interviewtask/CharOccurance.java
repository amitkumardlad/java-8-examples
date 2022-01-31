package code.java8.interviewtask;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurance {

	public static void test1(String a) {
		System.out.println("String a::"+a);
	}
	
	public static void test1(Object a) {
		System.out.println("String aa::"+a);
	}

	public static void main(String[] args) {
		test1(null);
		showCharacterOccurance("Occurances");
	}

	private static void showCharacterOccurance(String string) {
		
		Map<Character, Integer> occurance= new LinkedHashMap<Character, Integer>();
		
		char[] strChar = string.toCharArray();
		for(int i=0;i<strChar.length; i++) {
			if(occurance.containsKey(strChar[i])) {
				int cnt=occurance.get(strChar[i]);
				occurance.put(strChar[i], ++cnt);
			} else {
				occurance.put(strChar[i], 1);
			}
		}
		for (Entry<Character, Integer> mapData : occurance.entrySet()) {
			System.out.println( mapData.getKey() +"::"+ mapData.getValue());
		}
		
		//Using Lambda Expression
		string.chars().mapToObj(i -> Character.valueOf((char) i))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.forEach(System.out::println);
		
	}
}
