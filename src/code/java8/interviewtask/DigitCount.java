package code.java8.interviewtask;

import java.util.TreeSet;
import java.util.regex.Pattern;

public class DigitCount {
	public static final Pattern NUMERIC_PATTERN = Pattern.compile("\\d+");

	public static void main(String[] args) {
		count("23");
		count("0081");
		count("022");
	}

	public static void count(String S) {
		TreeSet<Integer> uniques = new TreeSet<Integer>();
		for (int index = 0; index < S.length(); index++) {
			char[]arr = S.toCharArray();
			for (int j = 0; j <= 9; j++) {
				arr[index]=Character.forDigit(j, 10);
				String temp = new String(arr);
				//System.out.println("String Number::"+temp);
				int chk = Integer.parseInt(temp);
				if(chk %3 == 0) {
					uniques.add(chk);
				}
			}
		}
		System.out.println("String Number::"+S+" and count data::" + uniques +"::"+uniques.size());
	}
	
}
