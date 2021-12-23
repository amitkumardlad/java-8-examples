package code.java8.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapUsingLambda {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Intwala");
		map.put(3, "Prajapati");
		map.put(1, "Mistry");
		map.put(2, "Kanchwala");
		map.put(4, "Lad");
		System.out.println("Map::" + map);
		List<Object> list = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
		System.out.println("Name Map::" + list);

		System.out.println("\nSorted Map based on Key::");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("\nSorted Map based on Value::");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		
		Map<Float, String> ascsortedMAP = new TreeMap<Float, String>();

		ascsortedMAP.put(8f, "name8");
		ascsortedMAP.put(5f, "name5");
		ascsortedMAP.put(15f, "name15");
		ascsortedMAP.put(35f, "name35");
		ascsortedMAP.put(44f, "name44");
		ascsortedMAP.put(7f, "name7");
		ascsortedMAP.put(6f, "name6");

		for (Entry<Float, String> mapData : ascsortedMAP.entrySet()) {
			System.out.println("Key : " + mapData.getKey() + "Value : " + mapData.getValue());
		}
	}

}
