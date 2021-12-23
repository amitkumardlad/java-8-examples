package code.java8.interviewtask;

public class StringCompare {

	static boolean isRotated(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		String str1 = "amazon";
		String str2 = "onamaz";
		System.out.println((str1+ str2) );
		System.out.println(str2);
		System.out.println((str1 + str1).indexOf(str2));
		System.out.println(isRotated(str1, str2) ? "Yes" : "No");
		System.out.println(isRotated("temperature", "peraturetme") ? "Yes" : "No");

	}
}
