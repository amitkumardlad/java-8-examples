package code.java8.interviewtask;

public class GetSystemProperties {

	public static void main(String[] args) {
		System.out.println("JAVA HOME ::"+System.getProperty("java.home"));
		System.out.println("JAVA VESION ::"+System.getProperty("java.version"));
		System.out.println("JAVA Bit Version ::"+System.getProperty("sun.arch.data.model"));
		System.out.println("Operating System architecture ::"+System.getProperty("os.arch"));
		System.out.println("Operating System Nane ::"+System.getProperty("os.name"));
		System.out.println("Operating System version ::"+System.getProperty("os.version"));
		
		System.out.println("USER HOME ::"+System.getProperty("user.home"));
		System.out.println("USER DIR ::"+System.getProperty("user.dir"));
		System.out.println("User Account Name ::"+System.getProperty("user.name"));
		System.out.println("Path separator ::"+System.getProperty("path.separator"));
		System.out.println("Line separator ::"+System.getProperty("line.separator"));
		System.out.println("File separator ::"+System.getProperty("file.separator"));

	}

}
