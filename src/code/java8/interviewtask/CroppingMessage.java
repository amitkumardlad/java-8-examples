package code.java8.interviewtask;

public class CroppingMessage {

	public static void main(String[] args) {

		System.out.println(crop("The quick brown fox jumped over the fence", 11) + ">");
		System.out.println(crop("The quick brown fox jumped over the fence", 9) + ">");
		System.out.println(crop("The quick brown fox jumped over the fence", 8) + ">");
		System.out.println(crop("The              ", 6) + ">");
		System.out.println(crop("The quick ", 20) + ">");
	}

	public static String crop(String message, int maxLength) {
		String part = (message.length() >= maxLength + 1) ? message.substring(0, maxLength + 1) : message;
		return part.substring(0, part.lastIndexOf(" ")).trim();
	}

}
