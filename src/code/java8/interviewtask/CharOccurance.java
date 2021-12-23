package code.java8.interviewtask;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurance {


	public static void main(String[] args) {
		
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
		
		//occurance.entrySet().stream().forEach((Entry<k,v> e)=> System.out.print(k+""+v));
	}
}
