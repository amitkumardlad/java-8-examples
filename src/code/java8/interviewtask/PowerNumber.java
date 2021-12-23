package code.java8.interviewtask;
public class PowerNumber {

	public static void main(String[] args) {
		System.out.println(power(2, 7));
	}

	public static int power(int num, int powerraised) {
		if (powerraised == 1) {
			return 1;
		} else {
			return num * power(num, powerraised - 1);
		}
	}

}
